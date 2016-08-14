class Movement:
    def __init__(self):
        self.motions = list()

    def append_motion(self, motion=None):
        self.motions.append(motion)

    def get_maximum_duration(self) -> int:
        """
        >>> from Watchdog import Main
        >>> main = Main()
        >>> from MessageReader import MessageReader
        >>> data = main.send_message(open('test.json'))
        >>> message_reader = MessageReader()
        >>> movements = message_reader.read_data(data)
        >>> movement = movements[0]
        >>> movement.get_maximum_duration()
        2000

        :return: int max duration of motion of movement
        """
        listtest = [motion.duration.duration for motion in self.motions]
        return max(listtest)

