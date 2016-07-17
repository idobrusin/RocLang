// HOWTO:
// 1. Start roscore
// 2. rosrun rosserial_python serial_node.py /dev/tty.usbmodemFD121
//    where /dev.. is the usb port of arduino
// 3. echo topic for convenience
// 4. send cmd to test functionality

#if defined(ARDUINO) && ARDUINO >= 100

#include "Arduino.h"
#include "Joint.h"

#else
#include <WProgram.h>
#endif

#include <Servo.h>
#include <ros.h>
#include <sensor_msgs/JointState.h>


const int NUM_SERVOS = 6;

ros::NodeHandle nh;
Servo servos[NUM_SERVOS];
Joint* jointList[NUM_SERVOS];

// TODO: Configure ports / pins
int PIN_HEAD_TILT               = 9;
int PIN_HEAD_UPDOWN             = 2;
int PIN_HEAD_LEFTRIGHT          = 3;
int PIN_EYES_UPDOWN             = 4;
int PIN_EYE_LEFTRIGHT           = 5;
int PIN_JAW                     = 6;

int MIN_ANGLE_HEAD_TILT         = 0;
int MIN_ANGLE_HEAD_UPDOWN       = 0;
int MIN_ANGLE_HEAD_LEFTRIGHT    = 0;
int MIN_ANGLE_EYES_UPDOWN       = 0;
int MIN_ANGLE_EYES_LEFTRIGHT    = 0;
int MIN_ANGLE_JAW               = 0;

int MAX_ANGLE_HEAD_TILT         = 180;
int MAX_ANGLE_HEAD_UPDOWN       = 180;
int MAX_ANGLE_HEAD_LEFTRIGHT    = 180;
int MAX_ANGLE_EYES_UPDOWN       = 180;
int MAX_ANGLE_EYES_LEFTRIGHT    = 180;
int MAX_ANGLE_JAW               = 180;


/**
 * Initializes servo array
 */
void initServosJoints() {

    for (int i = 0; i < NUM_SERVOS; i++) {
        servos[i] = Servo();
    }

    servos[0].attach(PIN_HEAD_TILT,      MIN_ANGLE_HEAD_TILT,      MAX_ANGLE_HEAD_TILT);
    servos[1].attach(PIN_HEAD_UPDOWN,    MIN_ANGLE_HEAD_UPDOWN,    MAX_ANGLE_HEAD_UPDOWN);
    servos[2].attach(PIN_HEAD_LEFTRIGHT, MIN_ANGLE_HEAD_LEFTRIGHT, MAX_ANGLE_HEAD_LEFTRIGHT);
    servos[3].attach(PIN_EYES_UPDOWN,    MIN_ANGLE_EYES_UPDOWN,    MAX_ANGLE_EYES_UPDOWN);
    servos[4].attach(PIN_EYE_LEFTRIGHT,  MIN_ANGLE_EYES_LEFTRIGHT, MAX_ANGLE_EYES_LEFTRIGHT);
    servos[5].attach(PIN_JAW,            MIN_ANGLE_JAW,            MAX_ANGLE_JAW);

    jointList[0] = new Joint("head_tilt",           -0.30f,  0.30f,  0, MIN_ANGLE_HEAD_TILT,      MAX_ANGLE_HEAD_TILT);
    jointList[1] = new Joint("head_updown",         -0.30f,  0.30f,  1, MIN_ANGLE_HEAD_UPDOWN,    MAX_ANGLE_HEAD_UPDOWN);
    jointList[2] = new Joint("head_leftright",      -1.57f,  1.57f,  2, MIN_ANGLE_HEAD_LEFTRIGHT, MAX_ANGLE_HEAD_LEFTRIGHT);
    jointList[3] = new Joint("eyes_updown",         -0.45f,  0.45f,  3, MIN_ANGLE_EYES_UPDOWN,    MAX_ANGLE_EYES_UPDOWN);
    jointList[4] = new Joint("eye_leftright",       -0.45f,  0.45f,  4, MIN_ANGLE_EYES_LEFTRIGHT, MAX_ANGLE_EYES_LEFTRIGHT);
    jointList[5] = new Joint("jaw",                  0.00f,  0.15f,  5, MIN_ANGLE_JAW,            MAX_ANGLE_JAW);
}

Joint* findJointByName(char* name) {
    for (unsigned int i = 0; i < NUM_SERVOS; i++) {
        if (strcmp(name, jointList[i]->name) == 0) {
            return jointList[i];
        };
    }
    return NULL;
}

/**
 * Servo callback with given joint state command
 */
void servoCallback(const sensor_msgs::JointState &cmd_msg) {
    for (unsigned int i = 0; i < cmd_msg.name_length; i++) {
        // Retrieve joint configuration
        Joint* joint = findJointByName(cmd_msg.name[i]);
        if (joint != NULL) {
            // Move servo to specified position
            servos[joint->servoIndex].write(joint->convertJointPositionToServoAngle(cmd_msg.position[i]));
        }

//        Joint* joint = jointList[0];
//        servos[joint->servoIndex].write(joint->convertJointPositionToServoAngle(cmd_msg.position[0]));
    }
    digitalWrite(13, HIGH - digitalRead(13));  //toggle led
}

ros::Subscriber<sensor_msgs::JointState> sub("joint_command", servoCallback);

void setup() {
    Servo servo = Servo();
    servo.attach(9,0, 180);
    servo.write(0);
//    pinMode(13, OUTPUT);
//    nh.initNode();
//    nh.subscribe(sub);
//
//    initServosJoints();
}

void loop() {
    nh.spinOnce();
    delay(1);
}