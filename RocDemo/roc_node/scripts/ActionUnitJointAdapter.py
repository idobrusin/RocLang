import json

import numpy

from models.Joint import Joint


class ActionUnitJointAdapter:
    def __init__(self, config_file):
        """
        :param config_file:
        """

        self.joints = dict()
        self.action_unit_joint_dict = dict()

        with open(config_file, 'r') as f:
            config = json.load(f, parse_float=float)

        action_unit_joint_map = config["action_units"]

        # Create joint list
        joint_angles = config["joints"]
        for joint_name, values in joint_angles.items():
            # print("Name:", joint_name)
            # print("Min:", values["min_angle"])
            # print("Max:", values["max_angle"])
            joint = Joint(joint_name, values["min_angle"], values["max_angle"])
            self.joints[joint_name] = joint

        # Create dict to map action unit to servo with correct ranges
        for action_unit, joints in action_unit_joint_map.items():
            self.action_unit_joint_dict[action_unit] = list()
            for i, joint in enumerate(joints):
                if type(joint) is dict:
                    self.action_unit_joint_dict[action_unit].append(self.change_joint_bounds(joint["joint"]))
                else:
                    if joint in self.joints:
                        self.action_unit_joint_dict[action_unit].append(self.joints[joint])

    def change_joint_bounds(self, joint_info):
        """
        >>> action_unit_mapper = ActionUnitJointAdapter("config/config.json")
        >>> joint_list = action_unit_mapper.action_unit_joint_dict["51"]
        >>> print(joint_list[0].min_angle)
        0.0
        >>> print(joint_list[0].max_angle)
        1.57
        >>> joint_list = action_unit_mapper.action_unit_joint_dict["52"]
        >>> print(joint_list[0].min_angle)
        0.0
        >>> print(joint_list[0].max_angle)
        -1.57

        :param joint_info:
        :return:
        """
        min = 0
        max = 0
        joint = self.joints[joint_info["name"]]
        if "range" in joint_info:
            min = joint.min_angle
            max = joint.max_angle
            range = joint_info["range"]
            median = (max + min) / 2
            if range == "lower":
                # swap min an max to have for correct intensity arround median
                max = min
                min = median
            elif range == "upper":
                min = median
        return Joint(joint_info["name"], min, max)

    def action_unit_to_joints(self, action_unit: str) -> list:
        """
        Converts given action unit to joint.
        :return:
        >>> actionAdapter = ActionUnitJointAdapter("config/config.json")
        >>> joints = actionAdapter.action_unit_joint_dict["51"]
        >>> print(joints[0].name)
        head_leftright
        >>> print(joints[0].min_angle)
        0.0
        >>> print(joints[0].max_angle)
        -1.57
        """
        if action_unit in self.action_unit_joint_dict:
            return self.action_unit_joint_dict[action_unit]
        return list()

    def intensity_to_angle(self, joint: Joint, intensity: str) -> float:
        """
        Converts given intensity to angle
        https://math.stackexchange.com/questions/43698/range-scaling-problem

        >>> actionAdapter = ActionUnitJointAdapter("config/config.json")
        >>> joint = Joint("test", 0, 100)
        >>> actionAdapter.intensity_to_angle(joint, "A")
        1.7986209962091548
        >>> actionAdapter.intensity_to_angle(joint, "B")
        11.920292202211758
        >>> actionAdapter.intensity_to_angle(joint, "C")
        50.0
        >>> actionAdapter.intensity_to_angle(joint, "D")
        88.079707797788245
        >>> actionAdapter.intensity_to_angle(joint, "E")
        98.201379003790848
        >>> joint2 = Joint("test2", -0.3, 0.3)
        >>> actionAdapter.intensity_to_angle(joint2, "A")
        -0.28920827402274507

        :return:
        """
        x = self.intensity_to_factor(intensity)
        return joint.min_angle + (joint.max_angle - joint.min_angle) * x

    def intensity_to_factor(self, intensity: str) -> float:
        """
        Returns a value between 0 and 1 for given intensity.
        :param intensity: str one of [A, B, C, D, E]
        :return: float between 0 and 1
        """
        x = self.intensity_string_to_int(intensity)
        return 0.5 * (numpy.tanh(x - 3) + 1)

    @staticmethod
    def intensity_string_to_int(intensity):
        if intensity is None:
            return 5

        if intensity == "A":
            return 1
        if intensity == "B":
            return 2
        if intensity == "C":
            return 3
        if intensity == "D":
            return 4
        if intensity == "E":
            return 5


if __name__ == '__main__':
    action_unit_mapper = ActionUnitJointAdapter("config/config.json")
    joints = action_unit_mapper.joints
    for joint in joints:
        print(joint)
