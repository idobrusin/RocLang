#!/usr/bin/python3

import sys
import logging
import time
import rospy
from std_msgs.msg import String
from roc.msg import Motion as MotionMsg



class Main:
    def __init__(self, args=None):
        logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(message)s', datefmt='%Y-%m-%d %H:%M:%S')
        pub = rospy.Publisher('ros_message_test', Motion, queue_size=10)
        rospy.init_node('Roc_Msg_Test', anonymous=True, disable_signals=True)
        rate = rospy.Rate(10)  # 10hz

        motion = Motion()
        motion.position = 0.1
        motion.duration = 1000
        while not rospy.is_shutdown():
            rospy.loginfo(time.time())
            pub.publish(motion)
            rate.sleep()


if __name__ == "__main__":
    main = Main(sys.argv[1:])
