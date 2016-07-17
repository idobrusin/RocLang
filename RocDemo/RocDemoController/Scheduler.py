import json
import time
from queue import Queue
import rospy
from sensor_msgs.msg import JointState
from std_msgs.msg import Header
from std_msgs.msg import String

from ActionUnitJointAdapter import ActionUnitJointAdapter
from MessageReader import MessageReader
from models import Motion
from models.Movement import Movement

class MessageQueue(Queue):
    def _init(self, maxsize=0):
        """
        :param maxsize:
        :return:
        """
        super()._init(maxsize)
        self.current_start_time = 0
        self.current_duration = 0

    def should_send(self) -> bool:
        if self.qsize() == 0:
            self.current_start_time = 0
            self.current_duration = 0
            return False

        now = int(round(time.time() * 1000))
        if now - self.current_start_time >= self.current_duration:
            return True
        return False

    def get_next(self) -> Motion:
        next = self.get()
        print("Sending next:", next)
        self.current_duration = next.get_maximum_duration()
        self.current_start_time = int(round(time.time() * 1000))
        return next


class RocScheduler(object):

    def __init__(self):
        self.msg_queue = MessageQueue()
        self.msg_count = 0

        rospy.init_node('Roc_Scheduler')

        self.pub = rospy.Publisher('/joint_command', JointState, latch=True, queue_size=10)
        rospy.Subscriber('/ros_movements', String, self.parse_message)
        self.action_unit_adapter = ActionUnitJointAdapter('config.json')
        self.run()

    def parse_message(self, msg):
        self.msg_count += 1
        print("Parsing msg number: %s", self.msg_count)
        data = json.loads(msg.data)
        message_reader = MessageReader()
        movements = message_reader.read_data(data)
        print("Number of movements: %s", len(movements))
        self.add_movements(movements)

    def add_movements(self, movements):
        print("Adding %s movements to queue", len(movements))
        for movement in movements:
            self.msg_queue.put(movement)
            print("Queue size after insert: %s", self.msg_queue.qsize())

    def get_movement_command(self, movement: Movement) -> list:
        """
        :param movement:
        :return:
        """

        cmd = JointState()
        cmd.header.stamp = rospy.Time.now()
        names = list()
        positions = list()
        for motion in movement.motions:
            joints = self.action_unit_adapter.action_unit_to_joints(motion.action_unit.number)
            for joint in joints:
                print(joint.name)
                names.append(joint.name)
                angle = self.action_unit_adapter.intensity_to_angle(joint, motion.action_unit.intensity)
                positions.append(angle)
        cmd.name = names
        cmd.position = positions
        cmd.velocity = []
        cmd.effort = []
        return cmd

    def run(self):
        print("Starting scheduler.")
        rate = rospy.Rate(100)
        while not rospy.is_shutdown():
            if self.msg_queue.should_send():
                print("Scheduler sending new message")
                movement = self.msg_queue.get_next()
                self.pub.publish(self.get_movement_command(movement))
            rate.sleep()


if __name__ == '__main__':
    scheduler = RocScheduler()
