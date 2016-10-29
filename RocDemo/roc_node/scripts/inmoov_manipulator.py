#! /usr/bin/env python
from queue import Queue

import argparse
import sys
import logging

import rospy
from sensor_msgs.msg import JointState
from std_msgs.msg import Header
import time

import numpy as np
import scipy
from scipy import interpolate
import matplotlib.pyplot as plt

from roc.msg import Motion as MotionMsg
from roc.msg import Movement as MovementMsg
from roc.msg import Command as CommandMsg


class JointStateReader:
    def __init__(self, callback = None):
        self.active = True
        self.callback = callback
        self.subscriber = rospy.Subscriber('joint_states', JointState, self.ros_callback)

    def ros_callback(self, data):
        """
        Receives data once and inactivates itself.
        Calls callback with data received from ROS
        :param data: provided by ROS
        :return: void
        """
        if self.active:
            self.active = False  # Deactivate after data is read.
            if self.callback:
                self.callback(data)


class InmoovManipulator:
    def __init__(self, show_plot):
        self.show_plot = show_plot
        self.joint_names = list()  # list of all joints
        self.joint_current_positions = list()  # list of last positions
        self.queue = Queue()


    def get_motion_from_movement(self, movement):
        joint_name_list = list()
        joint_goal_position_list = list()
        joint_duration_list = list()
        for motion in movement.motions:
            joint_name_list.append(motion.name)
            joint_goal_position_list.append(motion.position)
            joint_duration_list.append(motion.duration)

        return joint_name_list, joint_goal_position_list, joint_duration_list

    def update_current_joint_states(self, data):
        """Callback function updating current joint states
        """
        print("Update current joint positions")
        self.joint_names = list()
        self.joint_current_positions = list()

        # Fill in the global list with current status
        for joint, position in zip(data.name, data.position):
            self.joint_names.append(joint)
            self.joint_current_positions.append(position)

    def receive_command(self, data):
        for movement in data.movements:
            self.queue.put(movement)

    def motion_smoother(self, linear_trajectory, u_param):
        """smoothing function that return parameteric spline representation.
        input: waypoints
        output: parameteric representation and time step tau
        """

        u_param_scaled = [0] + [x / 10 for x in u_param]
        tck, tau = interpolate.splprep(linear_trajectory, u=u_param_scaled, k=2, s=0.1)
        new_tau = np.arange(0, u_param_scaled[-1] + 1, 1)  #  u_param + 1 for spanning the whole array
        smoothed_trajectory = interpolate.splev(new_tau, tck)
        return new_tau, smoothed_trajectory

    def state_publisher(self):
        """
        Scheduler function that calculates reads the msg, call the smoothing function
        and then publish the commands
        """
        rospy.Subscriber('roc_command', CommandMsg, self.receive_command)
        rospy.Subscriber('joint_states', JointState, self.update_current_joint_states)

        pub = rospy.Publisher('joint_command', JointState, queue_size=10)
        rate = rospy.Rate(100)  # 100hz

        while not rospy.is_shutdown():
            """Reading the msg with the motion and command should be done here should be done here in a loop
            for now will be hard coded
            """
            # wait for queue to have an item
            current_movement = self.queue.get()
            if not current_movement:
                continue

            joint_name_list, joint_goal_position_list, joint_duration_list = self.get_motion_from_movement(current_movement)
            joint_current_position_list = list()  # TODO: Why resetting the joint positions?
            for joint_name in joint_name_list:
                joint_current_position_list.append(
                    self.joint_current_positions[self.joint_names.index(joint_name)])

            """Sort the arrays based on the shortest executionary motion till the longest
            """
            joint_name_list = [x for (y, x) in sorted(zip(joint_duration_list, joint_name_list))]
            joint_current_position_list = [x for (y, x) in
                                           sorted(zip(joint_duration_list, joint_current_position_list))]
            joint_goal_position_list = [x for (y, x) in sorted(zip(joint_duration_list, joint_goal_position_list))]
            joint_duration_list = sorted(joint_duration_list)
            max_duration = max(joint_duration_list)

            linear_trajectory = list()
            # compute the trajectory equivelance
            for i in range(0, len(joint_name_list)):
                for j in range(0, len(joint_name_list) + 1):
                    # if first position, then simply add current position
                    if j == 0:
                        linear_trajectory.append([joint_current_position_list[i]])
                        print("trajectory:", linear_trajectory)
                    else:
                        # Compute the scaling factor of every motion in comparison to the other.
                        scaling_factor = 1.0
                        if joint_duration_list[j - 1] / joint_duration_list[i] < 1:
                            print(joint_duration_list[j - 1], joint_duration_list[i])
                            scaling_factor = float(joint_duration_list[j - 1]) / joint_duration_list[i]
                        print(scaling_factor)
                        linear_trajectory[i].append(
                            ((joint_goal_position_list[i] - joint_current_position_list[i]) * scaling_factor) +
                            joint_current_position_list[i])
                        print("trajectory:", linear_trajectory)
            print(joint_duration_list)

            tau, smoothed_trajectory = self.motion_smoother(linear_trajectory, joint_duration_list)
            plt.plot(linear_trajectory[0], linear_trajectory[1], 'x', smoothed_trajectory[0],
                     smoothed_trajectory[1], 'b')
            plt.show()

            for i in range(0, len(tau)):
                cmd = JointState()
                cmd.header.stamp = rospy.get_rostime()
                cmd.name = joint_name_list
                cmd.position = [smoothed_trajectory[0][i], smoothed_trajectory[1][i]]
                cmd.velocity = []
                cmd.effort = []
                pub.publish(cmd)
                rate.sleep()


def init_arg_parser(args):
    """
    Initializes command line argument parser

    :return:
    """
    arg_parser = argparse.ArgumentParser(
        description='Control node for the InMoov robot head. Receives movement commands and calculates trajectory.')

    arg_parser.add_argument('-p', '--showplot',
                            action='store_true',
                            dest='showplot',
                            help='Triggers display of plot for calculated trajectory')

    arg_parser.add_argument('--version', action='version', version='%(prog)s 0.1a')

    args = arg_parser.parse_args(args)

    return args

if __name__ == '__main__':
    logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(message)s', datefmt='%Y-%m-%d %H:%M:%S')

    show_plot = False
    args = init_arg_parser(sys.argv[1:])
    if args:
        show_plot = args.showplot
        print("Show plot: true")

    rospy.init_node('inmoov_manipulator', anonymous=True)
    print("Initializing node...")
    inmoov_manipulator = InmoovManipulator(show_plot)
    joint_state_reader = JointStateReader(inmoov_manipulator.update_current_joint_states)
    inmoov_manipulator.state_publisher()
