#!/usr/bin/python3

import sys
import logging
import time
import rospy
from std_msgs.msg import String

from roc.msg import Motion as MotionMsg
from roc.msg import Movement as MovementMsg
from roc.msg import Command as CommandMsg


class Main:
    def __init__(self, args=None):
        logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(message)s', datefmt='%Y-%m-%d %H:%M:%S')
        pub = rospy.Publisher('roc_command', CommandMsg, queue_size=10)
        rospy.init_node('Roc_Msg_Test', anonymous=True, disable_signals=True)
        rate = rospy.Rate(10)  # 10hz

        command = CommandMsg()
        # ---------------------
        motion1 = MotionMsg()
        motion1.name = "eye_leftright"
        motion1.position = -0.44
        motion1.duration = 3000

        motion2 = MotionMsg()
        motion2.name = "eyes_updown"
        motion2.position = 0.44
        motion2.duration = 1000

        movement1 = MovementMsg()
        movement1.motions.append(motion1)
        movement1.motions.append(motion2)

        # ---------------------
        motion3 = MotionMsg()
        motion3.duration = 3000
        motion3.position = 0.44
        motion3.name = "eye_leftright"

        motion4 = MotionMsg()
        motion4.duration = 1000
        motion4.position = -0.44
        motion4.name = "eyes_updown"

        movement2 = MovementMsg()
        movement2.motions.append(motion3)
        movement2.motions.append(motion4)

        command.movements.append(movement1)
        command.movements.append(movement2)

        if not rospy.is_shutdown():
            rospy.loginfo(time.time())
            pub.publish(command)
            rate.sleep()


if __name__ == "__main__":
    main = Main(sys.argv[1:])
