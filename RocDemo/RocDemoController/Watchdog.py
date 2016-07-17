#!python3

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


class RosThread(threading.Thread):

    def __init__(self, group=None, target=None, name=None, args=(), kwargs=None, *, daemon=None):
        super().__init__(group, target, name, args, kwargs, daemon=daemon)
        self.queue = Queue()

    def run(self):
        print("ROS-THREAD: Starting Ros thread")
        pub = rospy.Publisher('ros_movements', String, queue_size=10)
        rospy.init_node('Roc_CMD', anonymous=True, disable_signals=True)
        rate = rospy.Rate(10)  # 10hz
        while not rospy.is_shutdown():
            if self.queue.qsize() > 0:
                msg = self.queue.get()
                rospy.loginfo(time.time())
                pub.publish(json.dumps(msg))
                rate.sleep()
            rate.sleep()

    def add_msg(self, msg):
        print("ROS-THREAD: Adding msg to ros queue")
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
        print("MAIN-THEAD: Adding msg to queue")
        try:
            data = json.load(file)
            self.ros_thread.add_msg(data)
        except JSONDecodeError:
            print("Invalid file!")
            data = None
        return data


if __name__ == "__main__":
    main = Main(sys.argv[1:])
