#! /usr/bin/env python
from collections import OrderedDict

import numpy as np
from scipy import interpolate
import matplotlib.pyplot as plt
import logging


class MotionSmoother:
    def __init__(self, rate=100, show_plot=False):
        self.rate = rate  # determines the number of steps for the motions
        self.show_plot = show_plot

    def smooth(self, data_points):
        """
        Calculates smoothed trajectory for given data points.
        :return: tau, smoothed_trajectory
        >>> data_points = [\
        [('a',0, 0),    ('b', 0, 0), ('c', 0, 0)], \
        [('b', 2, 40), ('a', 2, 250)], \
        [('c', 1, 100)], \
        [('b', 4, 250), ('a', 0, 500)]]
        >>> motion_smoother = MotionSmoother(show_plot=True)
        >>> joints, trajectories = motion_smoother.smooth(data_points)
        """
        movements = self.interpolate_data_points(data_points)
        joint_names = list()
        for motion in movements[0]:
            joint_names.append(motion[0])

        positions_list, durations = self.get_positions_durations_list(movements)

        # Initialize result list
        trajectories = list()
        for i in range(len(positions_list)):
            trajectories.append(list())

        # Normalize durations
        durations_norm = self.normalize_duration(durations[-1])
        for i, positions in enumerate(positions_list):
            tck = interpolate.splrep(durations, positions, k=3, s=0.08)
            trajectories[i] = interpolate.splev(durations_norm, tck)

            if self.show_plot:
                plt.subplot(len(trajectories), 1, i + 1)
                plt.plot(durations, positions, 'go', label='Data')
                plt.plot(durations_norm, trajectories[i], 'b')

        if self.show_plot:
            plt.show()

        # print(joint_names, trajectories)
        return joint_names, trajectories

    def interpolate_data_points(self, data_points):
        """
        Scale movements in relation to each other.
        Creates intermediate data points for an equal number of data points
        in a movement for each motion.
        :param data_points:
        :return:
        >>> data_points = [\
        [('a', 0, 0),    ('b', 0, 0), ('c', 0, 0)], \
        [('b', 2, 500), ('a', 2, 250)], \
        [('c', 1, 100)], \
        [('b', 4, 250), ('a', 0, 500)]]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.interpolate_data_points(data_points)
        [[('a', 0, 0), ('b', 0, 0), ('c', 0, 0)], \
[('a', 2, 250), ('b', 1.0, 250), ('c', 0, 250)], [('a', 2, 500), \
('b', 2, 500), ('c', 0, 500)], [('a', 2, 600), ('b', 2, 600), ('c', 1, 600)], \
[('a', 1.0, 850), ('b', 4, 850), ('c', 1, 850)], [('a', 0, 1100), \
('b', 4, 1100), ('c', 1, 1100)]]
        """
        movements = list()
        movements.append(data_points[0])

        # Stores last known positions for interpolating intermediate points
        last_positions = self.get_joint_position_dict(data_points[0])  # Init with first data point
        last_duration = 0
        for movement in data_points[1:]:  # first data point contains init_positions
            # Appends interpolated motions and updates last position for further computation
            interpolated_movement, last_positions, duration = self.interpolate_movement(movement, last_positions)
            for inter_mov in interpolated_movement:
                inter_mov = self.increase_duration_for_movement(inter_mov, last_duration)
                movements.append(inter_mov)
            last_duration = last_duration + duration
        # Returns sorted list for keeping order after smoothing
        return self.sort_data_by_name(movements)

    def interpolate_movement(self, movement, last_positions):
        """
        Inserts intermediate steps for given movement, so each time point is
        present in each motion of a movement.
        :param: movement containing motions
        :param: joint_names of all joint which occur in the data set
        :return: list of motion tuples for given movement
        :return: dict of last positions for each joint
        :return: overall duration of movement

        >>> last_positions = {'a': 0, 'b': 2, 'c': 2, 'd': 2}
        >>> movement = [('a', 4, 100), ('b', 0, 150), ('c', 0, 200)]
        >>> motion_smoother = MotionSmoother()
        >>> movement, last_positions, duration = motion_smoother.interpolate_movement(movement, last_positions)
        >>> print(movement)
        [[('d', 2, 100), ('a', 4, 100), ('b', 0.6666666666666667, 100), ('c', 1.0, 100)], [('d', 2, 150), \
('a', 4, 150), ('b', 0, 150), ('c', 0.5, 150)], [('d', 2, 200), ('a', 4, 200), ('b', 0, 200), ('c', 0, 200)]]
        >>> print(last_positions['a'])
        4
        >>> print(last_positions['b'])
        0
        >>> print(last_positions['c'])
        0
        >>> print(last_positions['d'])
        2
        >>> print(duration)
        200
        """
        result = list()
        movement = self.sort_motions_by_duration(movement)

        # Keep initial positions as a copy for calculating scaled value
        init_positions = dict(last_positions)

        # Tracks the joints which are not part of the movement / finished moving.
        fixed_joints = self.get_joints_not_in_movement(movement, list(last_positions.keys()))

        current_duration = 0  # used to return longest duration of movement
        for i, motion in enumerate(movement):
            # Stores intermediate data points for each motion
            motion_list = list()

            # Map current motion data
            current_joint_name = motion[0]
            current_position = motion[1]
            current_duration = motion[2]

            # Process current motion
            last_positions[current_joint_name] = current_position
            fixed_joints.append(current_joint_name)

            # Append value for already fixed motions (including current motion)
            for fixed_joint in fixed_joints:
                motion_list.append((fixed_joint, last_positions[fixed_joint], current_duration))

            # Insert new data point for each non-fixed motion for current duration
            for j in range(i + 1, len(movement)):
                # Linear interpolation between two points:
                # pos = init_pos + (current_dur - init_dur) / (goal_dur - init_dur) * (init_pos - goal_pos)
                # where init_dur = 0, since a movement starts at duration 0.
                # Resulting formula:
                # pos = init_pos + (current_dur) / (goal_dur) * (init_pos - goal_pos)
                init_position = init_positions[movement[j][0]]
                interpolated_position = init_position + current_duration / movement[j][2] * (movement[j][1] - init_position)
                motion_list.append((movement[j][0], interpolated_position, current_duration))
            result.append(motion_list)
        return result, last_positions, current_duration  # order dict again

    def increase_duration_for_movement(self, motion_list, duration):
        """
        Increases all durations of movements for given list of motions
        :param motion_list: list of motions
        :param duration: duration amount by which the motion durations should be increased
        :return: list of motions with increased duration
        >>> data_points = [('b',0, 0),    ('a', 0, 100), ('c', 0, 200)]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.increase_duration_for_movement(data_points, 100)
        [('b', 0, 100), ('a', 0, 200), ('c', 0, 300)]
        """
        result = list()
        for motion in motion_list:
            motion = (motion[0], motion[1], motion[2] + duration)
            result.append(motion)
        return result

    def sort_motions_by_duration(self, motions: (str, int, int)) -> (str, int, int):
        """
        Sorts motion list by duration.
        Motion is a tuple: (joint_name, position, duration)
        :param motions: list of motions to sort
        :return: sorted list of motions, sorted by duration

        >>> motions = [('a', 4, 300), ('b', 0, 100), \
        ('c', 0, 200), ('d', 0, 400)]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.sort_motions_by_duration(motions)
        [('b', 0, 100), ('c', 0, 200), ('a', 4, 300), ('d', 0, 400)]
        """
        return sorted(motions, key=lambda tup: tup[2])

    def sort_data_by_name(self, data_points):
        """
        Sorts movements in data points by name.
        :param data_points: data point which should be sorted
        :return: data points whith motions of a movement are sorted by name.

        >>> data_points = [\
        [('b',0, 0),    ('a', 0, 0), ('c', 0, 0)], \
        [('b', 2, 0), ('a', 2, 0)], \
        [('b', 4, 0), ('c', 0, 0)]]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.sort_data_by_name(data_points)
        [[('a', 0, 0), ('b', 0, 0), ('c', 0, 0)], [('a', 2, 0), \
('b', 2, 0)], [('b', 4, 0), ('c', 0, 0)]]
        """
        result = list()
        for movement in data_points:
            result.append(sorted(movement, key=lambda tup: tup[0]))
        return result

    def get_joint_position_dict(self, data):
        """
        Constructs dictionary with joints and their respective position
        :param data: list tuples (joint_name, position, duration)
        :return: dict of joint_names with their position

        >>> data = [('a', 0, 0), ('b', 1, 0), ('c', 2, 0)]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.get_joint_position_dict(data)
        OrderedDict([('a', 0), ('b', 1), ('c', 2)])
        """
        result = OrderedDict()
        for motion in data:
            result[motion[0]] = motion[1]
        return result

    def get_joints_not_in_movement(self, movement, joint_names):
        """
        Returns a list of joints of which are not part of the movement for given joint_names
        :param movement:
        :param joint_names:
        :return: list of joint_names which are not affected (= not part) of the movement.

        >>> joint_names = ['a', 'b', 'c', 'd']
        >>> movement = [('a', 4, 100), ('b', 0.5, 150), ('c', 0, 200)]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.get_joints_not_in_movement(movement, joint_names)
        ['d']
        """
        result = list()
        joint_in_movement = [x[0] for x in movement]
        for joint in joint_names:
            if joint not in joint_in_movement:
                result.append(joint)
        return result

    def get_positions_durations_list(self, movements):
        """
        Returns a list of joint position lists and a list of durations
        for given motion.
        :param movements: list of movements
        :return: list of list of joint positions
        >>> data_points = [\
        [('a',0, 0),    ('b', 0, 0), ('c', 0, 0)], \
        [('b', 2, 10), ('a', 2, 20)], \
        [('c', 1, 10)], \
        [('b', 4, 10), ('a', 0, 20)]]
        >>> motion_smoother = MotionSmoother()
        >>> movements = motion_smoother.interpolate_data_points(data_points)
        >>> positions, durations = motion_smoother.get_positions_durations_list(movements)
        >>> print(positions)
        [[ 0.  1.  2.  2.  1.  0.]
         [ 0.  2.  2.  2.  4.  4.]
         [ 0.  0.  0.  1.  1.  1.]]
        >>> print(durations)
        [ 0 10 20 30 40 50]
        """
        num_joints = len(movements[0])  # equals number of joints in movements
        positions = list()
        for i in range(num_joints):
            positions.append(list())
        durations = list()

        for movement in movements:
            durations.append(movement[0][2])
            for i, motion in enumerate(movement):
                positions[i].append(motion[1])
        return np.array(positions,), np.array(durations)

    def normalize_duration(self, duration):
        """
        Creates list of values which are evenly distributed between 0 and the duration
        in dependence of the specified rate.
        :param duration: upper bound for list
        :return: list of values
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.normalize_duration(30)
        array([  0.,  10.,  20.,  30.])
        """
        tick_duration = 1000 / self.rate
        return np.arange(0, duration + tick_duration, tick_duration)

    def get_position_list_from_trajectory(self, trajectories, pos):
        """
        Returns a list of positions for given time position pos.
        :param trajectories: list of trajectories
        :param i: index in a list element of trajectories
        :return: list of positions

        >>> trajectories = [np.array([1,  2,  3]), np.array([5, 6, 7])]
        >>> motion_smoother = MotionSmoother()
        >>> motion_smoother.get_position_list_from_trajectory(trajectories, 0)
        [1, 5]
        >>> motion_smoother.get_position_list_from_trajectory(trajectories, 1)
        [2, 6]
        >>> motion_smoother.get_position_list_from_trajectory(trajectories, 2)
        [3, 7]
        """
        result = list()
        for i in range(len(trajectories)):
            result.append(trajectories[i][pos])
        return result
