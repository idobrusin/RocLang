from models.ActionUnit import ActionUnit
from models.Duration import Duration
from models.Motion import Motion
from models.Movement import Movement


class MessageReader:
    """
    Reads data from given json string and returns object representation of motion information.
    """
    def read_data(self, data: dict) -> list:
        """
        Returns list of Movements.

        >>> import json
        >>> data = json.load(open('test/test.json'))
        >>> message_reader = MessageReader()
        >>> movements = message_reader.read_data(data)
        >>> print(len(movements))
        3
        >>> print(len(movements[0].motions))
        2
        >>> print(movements[0].motions[0].action_unit.number)
        51
        >>> print(movements[0].motions[0].action_unit.intensity)
        A
        >>> print(movements[0].motions[0].duration.duration)
        1000
        >>> print(movements[0].motions[0].duration.duration_unit)
        milliseconds
        >>> print(movements[0].motions[1].action_unit.number)
        63
        >>> print(movements[0].motions[1].action_unit.intensity)
        E
        >>> print(movements[0].motions[1].duration.duration)
        2000
        >>> print(movements[0].motions[1].duration.duration_unit)
        milliseconds

        :param data: data as a nested dict object from json file.
        :return: list of movements with nested motions
        """
        movement_list = list()
        movements = data['movements']
        for movement in movements:
            movement = self.__convert_movement(movement)
            movement_list.append(movement)

        return movement_list

    @staticmethod
    def __convert_movement(movement_data: dict) -> Movement:
        movement = Movement()
        for motion_data in movement_data['motions']:
            motion_obj = Motion()
            motion_obj.action_unit = MessageReader.__convert_action_unit(motion_data)
            motion_obj.duration = MessageReader.__convert_duration(motion_data)
            movement.append_motion(motion_obj)
        return movement

    @staticmethod
    def __convert_action_unit(motion_data: dict) -> ActionUnit:
        action_unit = ActionUnit()
        action_unit.number = motion_data['action_unit']
        action_unit.intensity = motion_data['intensity']
        return action_unit

    @staticmethod
    def __convert_duration(motion_data: dict) -> Duration:
        duration = Duration()
        duration.duration = motion_data['duration']

        if 'duration_unit' in motion_data:
            duration.duration_unit = motion_data['duration_unit']
        if 'offset' in motion_data:
            duration.offset = motion_data['offset']
        return duration







