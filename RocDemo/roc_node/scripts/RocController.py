#!/usr/bin/python3

import sys
import logging
import threading
import json
from watchdog.observers import Observer
import argparse
from FileEventHandler import FileEventHandler
from queue import Queue
import time
import rospy
from std_msgs.msg import String
from roc.msg import Motion as MotionMsg
from roc.msg import Movement as MovementMsg
from roc.msg import Command as CommandMsg

from ActionUnitJointAdapter import ActionUnitJointAdapter
from MessageReader import MessageReader
from models import Motion
from models.Movement import Movement


class RosThread(threading.Thread):

    def __init__(self, group=None, target=None, name=None, args=(), kwargs=None, *, daemon=None):
        super().__init__(group, target, name, args, kwargs, daemon=daemon)
        self.queue = Queue()

    def run(self):
        logging.info("ROS-THREAD: Starting Ros thread")
        pub = rospy.Publisher('roc_command', CommandMsg, queue_size=10)
        rospy.init_node('Roc_CMD', anonymous=True, disable_signals=True)
        rate = rospy.Rate(10)  # 10hz

        while not rospy.is_shutdown():
            if self.queue.qsize() > 0:
                msg = self.queue.get()
                rospy.loginfo(time.time())
                pub.publish(msg)
                rate.sleep()
            rate.sleep()

    def add_msg(self, msg):
        logging.info("ROS-THREAD: Adding msg to ros queue")
        self.queue.put(msg)


class FileObserverThread(threading.Thread):
    def __init__(self, group=None, target=None, name=None, args=(), kwargs=None, *, daemon=None, patterns=None, path=None, callback=None):
        super().__init__(group, target, name, args, kwargs, daemon=daemon)
        self.patterns = patterns
        self.path = path
        self.callback = callback

    def run(self):
        """
        Starts file system watchdog with given parameters
        :return:
        """
        logging.info("FILE-THREAD: Observer starting")
        if not self.patterns:
            self.patterns = ["*.json"]
        event_handler = FileEventHandler(self.file_callback, self.patterns, None)

        observer = Observer()
        observer.schedule(event_handler, self.path, recursive=True)
        observer.start()
        try:
            while True:
                time.sleep(1)
        except KeyboardInterrupt:
            observer.stop()
        observer.join()
        logging.info("FILE-THREAD: Observer started")

    def file_callback(self, file_src):
        """
        Callback method which can be called from watchdog to trigger new sending of file.
        :param file_src:
        :return:
        """
        print("FILE-THREAD: Sending message for src:", file_src)
        file = open(file_src)
        self.callback(file)


class Main:
    def __init__(self, args=None):
        logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

        # Init Roc converter
        self.action_unit_adapter = ActionUnitJointAdapter('/home/iliadobrusin/catkin_ws/src/roc_node/scripts/config/config.json')
        self.message_reader = MessageReader()


        if args:
            arg_parser = self.init_arg_parser()
            args = arg_parser.parse_args(args)
            file = args.file
            path = args.path
            patterns = args.patterns
        else:
            file = None
            path = '.'
            patterns = None

        if file:
            # Send file directly.
            logging.info("Sending message from cmd line parameters")
            self.send_message(file)

        # init threads
        self.file_observer_thread = FileObserverThread(path=path, patterns=patterns, callback=self.send_message)
        self.file_observer_thread.start()

        self.ros_thread = RosThread()
        self.ros_thread.start()

    def init_arg_parser(self):
        """
        Initializes command line argument parser

        :return:
        """
        arg_parser = argparse.ArgumentParser(
            description='Message controller for reading and sending json encoded motor information via ROS')

        arg_parser.add_argument('-f', '--file',
                                action='store',
                                dest='file',
                                type=argparse.FileType('r'),
                                default=None,
                                help='Reads in file and send it immediately')

        arg_parser.add_argument('-p', '--path',
                                action='store',
                                dest='path',
                                default='.',
                                help='Path to be monitored for changes')

        arg_parser.add_argument('-P', '-pattern',
                                nargs='*',
                                dest='patterns',
                                default=None,
                                help='File pattern to be monitored (one or more)')

        arg_parser.add_argument('--version', action='version', version='%(prog)s 0.1a')

        return arg_parser

    def send_message(self, file):
        """
        Reads file and send content via ros.
        :param file:
        :return:
        """
        logging.info("MAIN-THEAD: Adding msg to queue")
        try:
            data = json.load(file)
        except JSONDecodeError:
            print("Invalid file!")
            return

        command = CommandMsg()
        movements = self.message_reader.read_data(data)
        for movement in movements:
            command.movements.append(self.get_movement_command(movement))
        self.ros_thread.add_msg(command)
        return data

    def get_movement_command(self, movement: Movement) -> MovementMsg:
        """
        :param movement:
        :return:
        """
        movement_msg = self.init_movement_msg()
        for motion in movement.motions:
            joints = self.action_unit_adapter.action_unit_to_joints(motion.action_unit.number)
            for joint in joints:
                position = self.action_unit_adapter.intensity_to_angle(joint, motion.action_unit.intensity)
                duration = motion.duration.duration
                print("position: ", position)
                print("duration: ", duration)

                if joint.name == "head_tilt":
                    movement_msg.head_tilt.position = position
                    movement_msg.head_tilt.duration = duration
                elif joint.name == "head_leftright":
                    movement_msg.head_leftright.position = position
                    movement_msg.head_leftright.duration = duration
                elif joint.name == "head_updown":
                    movement_msg.head_updown.position = position
                    movement_msg.head_updown.duration = duration
                elif joint.name == "eyes_updown":
                    movement_msg.eyes_updown.position = position
                    movement_msg.eyes_updown.duration = duration
                elif joint.name == "eye_leftright":
                    movement_msg.eyes_leftright.position = position
                    movement_msg.eyes_leftright.duration = duration
                elif joint.name == "jaw":
                    movement_msg.jaw.position = position
                    movement_msg.jaw.duration = duration

        return movement_msg

    def init_movement_msg(self):
        movement_msg = MovementMsg()
        movement_msg.head_leftright.position = 0
        movement_msg.head_leftright.duration = 0

        movement_msg.head_updown.position = 0
        movement_msg.head_updown.duration = 0

        movement_msg.head_tilt.position = 0
        movement_msg.head_tilt.duration = 0

        movement_msg.eyes_leftright.position = 0
        movement_msg.eyes_leftright.duration = 0

        movement_msg.eyes_updown = MotionMsg()
        movement_msg.eyes_updown.duration = 0

        movement_msg.jaw.position = 0
        movement_msg.jaw.duration = 0

        return movement_msg

if __name__ == "__main__":
    main = Main(sys.argv[1:])
