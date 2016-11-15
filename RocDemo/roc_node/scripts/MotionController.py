#! /usr/bin/env python

import argparse
import sys
import time
from queue import Queue
from itertools import zip_longest
import logging

import rospy

from sensor_msgs.msg import JointState

from roc.msg import Command as CommandMsg
from roc.msg import Motion as MotionMsg
from roc.msg import Movement as MovementMsg

from MotionSmoother import MotionSmoother


class MotionController:
    """
    Main class for controlling a robot head via Roc. Receives roc commands from ROS
    and sends movement trajectories to the robot.
    """

    def __init__(self, show_plot: bool=False, refresh_rate: int=100):
        """
        Initializes MotionController.
        Subscribes to ROS topics and initializes publisher
        :param show_plot boolean
        :return:
        """
        # Arguments
        self.__rate = rospy.Rate(refresh_rate)

        # Movement and joint data
        self.__roc_command_queue = Queue()

        # Motion smoother
        self.__motion_smoother = MotionSmoother(refresh_rate, show_plot)

        # ROS specific init
        self.roc_command_subscriber = rospy.Subscriber('roc_command', CommandMsg, self.roc_command_callback)
        self.joint_command_publisher = rospy.Publisher('joint_command', JointState, queue_size=10)
        self.joint_command_pin_publisher = rospy.Publisher('joint_command_pins', JointState, queue_size=10)

        # # Start ROS loop
        self.run()


    def roc_command_callback(self, data: CommandMsg):
        """
        Callback for receiving Roc commands.
        :return:
        """
        print("Roc command received")
        self.__roc_command_queue.put(data)


    def get_current_joint_positions(self):
        """
        Retrieves current joint positions via ROS.
        :return: list of tuples: (joint_name, position, duration)
        """
        data = rospy.client.wait_for_message("joint_states", JointState)
        print(data)
        # Create duration list with 0 values
        duration = list()
        for i in range(len(data.name)):
            duration.append(0)
        return list(zip_longest(data.name, data.position, duration))

    def run(self):
        """
        Main loop, runs until ROS node is shut down
        """
        print("Running main loop")

        # PIN_HEAD_TILT = 4;
        # PIN_HEAD_UPDOWN = 11;
        # PIN_HEAD_LEFTRIGHT = 9;
        # PIN_EYES_UPDOWN = 6;
        # PIN_EYE_LEFTRIGHT = 7;
        # PIN_JAW = 3;

        joint_pin_dict = dict()
        joint_pin_dict['head_leftright'] = '9'
        joint_pin_dict['head_tilt'] = '4'
        joint_pin_dict['head_updown'] = '11'
        joint_pin_dict['eyes_updown'] = '6'
        joint_pin_dict['eye_leftright'] = '7'
        joint_pin_dict['jaw'] = '3'

        while not rospy.is_shutdown():
            if not self.__roc_command_queue.empty():
                print("Run Roc programm")

                # Retrieve roc program and current joint positions
                roc_command = self.__roc_command_queue.get()
                current_positions = self.get_current_joint_positions()

                # Create data points from roc program and joint positions
                data_points = self.get_data_point_for_roc_command(current_positions, roc_command)
                print("")
                print("Data points for Roc program: ", data_points)

                # # Calculate smoothed trajectory
                joint_names, trajectories = self.__motion_smoother.smooth(data_points)

                # Send joint commands to robot from trajectory
                for i in range(len(trajectories[0])):
                    cmd = JointState()
                    cmd.header.stamp = rospy.get_rostime()
                    cmd.name = joint_names
                    cmd.position = self.__motion_smoother.get_position_list_from_trajectory(trajectories, i)
                    cmd.velocity = []
                    cmd.effort = []

                    cmd2 = JointState()
                    cmd2.header.stamp = rospy.get_rostime()
                    cmd2.name = self.get_joint_pins_from_names(joint_pin_dict, joint_names)
                    cmd2.position = self.__motion_smoother.get_position_list_from_trajectory(trajectories, i)
                    cmd2.velocity = []
                    cmd2.effort = []

                    self.joint_command_publisher.publish(cmd)
                    self.joint_command_pin_publisher.publish(cmd2)
                    self.__rate.sleep()

            self.__rate.sleep()

    def get_joint_pins_from_names(self, joint_pin_dict, joint_names):
        result = list()
        for joint_name in joint_names:
            result.append(joint_pin_dict[joint_name])
        return result



    def get_data_point_for_roc_command(self, current_joint_positions, roc_command):
        """
        Return list of data points for given roc command.
        List consists of lists with data points represented as tuples: (joint_name, position, duration)
        :param current_joint_positions: current joint position of InMoov robot
        :param roc_command: roc programm which should be executed by the robot
        :return: list of data points
        """
        data_points = list()
        # Concatenate current positions with movement data
        relevant_current_positions = self.get_relevant_current_positions(current_joint_positions, roc_command)
        print("")
        print("Current joint positions: ", relevant_current_positions)

        data_points.append(relevant_current_positions)
        for movement in self.get_movemnent_list(roc_command):
            data_points.append(movement)
        return data_points

    def get_movemnent_list(self, roc_command):
        """
        Returns list of movements for given Roc command. Each movement is a list of motions, represented by tuples:
        (joint_name, position, duration)
        :param roc_command:
        :return: list of movements
        """
        result = list()
        for movement in roc_command.movements:
            movement_list = list()
            for motion in movement.motions:
                movement_list.append((motion.name, motion.position, motion.duration))
            result.append(movement_list)
        return result

    def get_relevant_current_positions(self, current_joint_positions, roc_commands: CommandMsg) -> list((str, int, int)):
        """
        Returns relevant joint positions for given roc_command
        :return: list of tuples: (joint_name, position, duration)
        """
        result = set()
        for joint, position, duration in current_joint_positions:
            for joint_name in self.get_all_joint_names_in_roc_command(roc_commands):
                if joint == joint_name:
                    result.add((joint, position, duration))

        return list(result)

    def get_all_joint_names_in_roc_command(self, roc_command: CommandMsg) -> list():
        """
        Returns list of joint names which are used by given Roc command message
        :param roc_command: CommandMsg Roc command
        :return: list of names
        """
        result = set()
        for movement in roc_command.movements:
            for motion in movement.motions:
                result.add(motion.name)
        return list(result)

def get_cmd_args(args):
    """
    Initializes command line argument parser
    :return: args: command line arguments
    """
    arg_parser = argparse.ArgumentParser(
        description='Control node for the InMoov robot head. Receives movement commands and calculates trajectory.')
    arg_parser.add_argument('-p', '--showplot',
                            action='store_true',
                            dest='showplot',
                            help='Triggers display of plot for calculated trajectory')

    arg_parser.add_argument('--version', action='version', version='%(prog)s 0.1beta')
    return arg_parser.parse_args(args)

if __name__ == '__main__':
    logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

    show_plot = False
    args = get_cmd_args(sys.argv[1:])
    if args:
        show_plot = args.showplot
        print("Show plot: ", show_plot)
    rospy.init_node('inmoov_controller', anonymous=True)
    print("Initializing node...")
    motion_controller = MotionController(show_plot=show_plot)


