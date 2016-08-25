#! /usr/bin/env python
from queue import Queue

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

class InmoovManipulator:
    def __init__(self):
        self.callback_joint_names = list()
        self.callback_joint_current_positions = list()
        self.queue = Queue()


	def update_current_joint_states(self, data):
		"""Callback function updating current joint states
		"""
		#Clear the list from old posistions
		self.callback_joint_names = list()
		self.callback_joint_current_positions = list()

		#Fill in the global list with current status 
		for joint, position in zip(data.name, data.position):
			self.callback_joint_names.append(joint)
			self.callback_joint_current_positions.append(position)
		#print(self.callback_joint_current_positions)
		"""
		def get_command(self, data):
		Callback function updating command for the inmoov
		self.current_joint_states.name = data.name
		self.current_joint_states.position = data.position
		#print(self.current_joint_states.position)
		"""

    def get_command(self, data):
        print(data)
        self.queue.put(data.movements)

	def motion_smoother(self, linear_trajectory, u_param):
		"""smoothing function that return parameteric spline representation.
		input: waypoints
		output: parameteric representation and time step tau
		"""
		u_param_scaled = [0] + [x / 10 for x in u_param]
		tck, tau = interpolate.splprep(linear_trajectory, u = u_param_scaled, k=2, s=0)
		new_tau = np.arange(0, u_param_scaled[-1] + 1, 1)
		smoothed_trajectory = interpolate.splev(new_tau, tck)
		return new_tau, smoothed_trajectory

	def state_publisher(self):
		"""Scheduler function that calculates reads the msg, call the smoothing function
		and then publish the commands
		"""
		#Subscribe to joint_states topic 
		rospy.Subscriber('joint_states', JointState, self.update_current_joint_states)
		time.sleep(3)
		rospy.Subscriber('roc_command', CommandMsg, self.get_command)

		#Initialize Ros joint_command topic
		pub = rospy.Publisher('joint_command', JointState, queue_size=10)
		rate = rospy.Rate(100) # 100hz

		while not rospy.is_shutdown():

			"""Reading the msg with the motion and command should be done here should be done here in a loop
			for now will be hard coded
			"""
			#joint_name_list = ['head_leftright', 'head_updown']
			joint_current_position_list = list()
			print(self.callback_joint_names)
			for joint_name in joint_name_list:
				joint_current_position_list.append(self.callback_joint_current_positions[self.callback_joint_names.index(joint_name)])
			#joint_goal_position_list = [-0.187148585916, 0.15000000596]
			#joint_duration_list = [3000, 1500]

			"""Sort the arrays based on the shortest executionary motion till the longest
			"""
			joint_name_list = [x for (y,x) in sorted(zip(joint_duration_list,joint_name_list))]
			joint_current_position_list = [x for (y,x) in sorted(zip(joint_duration_list,joint_current_position_list))]
			joint_goal_position_list = [x for (y,x) in sorted(zip(joint_duration_list,joint_goal_position_list))]
			joint_duration_list = sorted(joint_duration_list)
			max_duration = max(joint_duration_list)

			linear_trajectory = list()
			#compute the trajectory equivelance
			for i in range(0, len(joint_name_list)):
				for j in range(0, len(joint_name_list) + 1):
					#if first position, then simply add current position
					if j == 0:
						linear_trajectory.append([joint_current_position_list[i]])
						print("trajectory:", linear_trajectory)
					else:
						#Compute the scaling factor of every motion in comparison to the other.
						scaling_factor = 1.0
						if joint_duration_list[j-1]/joint_duration_list[i] < 1:
							print(joint_duration_list[j-1], joint_duration_list[i])
							scaling_factor = float(joint_duration_list[j-1])/joint_duration_list[i]
						print(scaling_factor)
						linear_trajectory[i].append(((joint_goal_position_list[i] - joint_current_position_list[i]) * scaling_factor) + joint_current_position_list[i])
						print("trajectory:", linear_trajectory)
			print(joint_duration_list)

            """Reading the msg with the motion and command should be done here should be done here in a loop
            for now will be hard coded
            """
            current_movement = self.queue.get()
            if not current_movement:
                continue

            joint_name_list, joint_goal_position_list, joint_duration_list = self.get_motion_data(current_movement)

 	def get_motion_data(self, movement):
        joint_name_list = list()
        joint_goal_position_list = list()
        joint_duration_list = list()

        for motion in movement:
            joint_name_list.append(motion.name)
            joint_goal_position_list.append(motion.position)
            joint_duration_list.append(motion.duration)

        return joint_name_list, joint_goal_position_list, joint_duration_list

if __name__ == '__main__':
	rospy.init_node('inmoov_manipulator', anonymous=True)
	inmoov_manipulator = InmoovManipulator()
	inmoov_manipulator.state_publisher()
