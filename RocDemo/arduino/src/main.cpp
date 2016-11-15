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

/**
 * Number of servos used by the robot
 */
const int NUM_SERVOS = 6;


ros::NodeHandle nh;
Servo servos[NUM_SERVOS];
Joint* jointList[NUM_SERVOS];

// TODO: Configure ports / pins

// Index used to locate head part in servo and joint list
int INDEX_HEAD_TILT             = 0;
int INDEX_HEAD_UPDOWN           = 1;
int INDEX_HEAD_LEFTRIGHT        = 2;
int INDEX_EYES_UPDOWN           = 3;
int INDEX_EYE_LEFTRIGHT         = 4;
int INDEX_JAW                   = 5;

// Pin of servo connected to given head part
int PIN_HEAD_TILT               = 4;
int PIN_HEAD_UPDOWN             = 11;
int PIN_HEAD_LEFTRIGHT          = 9;
int PIN_EYES_UPDOWN             = 6;
int PIN_EYE_LEFTRIGHT           = 7;
int PIN_JAW                     = 3;

// Min and max angles of servos - DO NOT CHANGE WITHOUT TESTING
float MIN_ANGLE_HEAD_TILT         = 90;   // Correct
float MIN_ANGLE_HEAD_UPDOWN       = 50;   // Correct
float MIN_ANGLE_HEAD_LEFTRIGHT    = 50;   // Correct1
float MIN_ANGLE_EYES_UPDOWN       = 40;   // Correct1
float MIN_ANGLE_EYES_LEFTRIGHT    = 20;   // Correct1
float MIN_ANGLE_JAW               = 45;   // Correct1

float MAX_ANGLE_HEAD_TILT         = 90;   // Correct
float MAX_ANGLE_HEAD_UPDOWN       = 130;  // Correct
float MAX_ANGLE_HEAD_LEFTRIGHT    = 150;  // Correct1
float MAX_ANGLE_EYES_UPDOWN       = 95;  // Correct1
float MAX_ANGLE_EYES_LEFTRIGHT    = 90;   // Correct1
float MAX_ANGLE_JAW               = 90;   // Correct1


/**
 * Initializes servo array
 */
void initServosJoints() {

    for (int i = 0; i < NUM_SERVOS; i++) {
        servos[i] = Servo();
    }

    servos[INDEX_HEAD_TILT].attach(      PIN_HEAD_TILT);
    servos[INDEX_HEAD_UPDOWN].attach(    PIN_HEAD_UPDOWN);
    servos[INDEX_HEAD_LEFTRIGHT].attach( PIN_HEAD_LEFTRIGHT);
    servos[INDEX_EYES_UPDOWN].attach(    PIN_EYES_UPDOWN);
    servos[INDEX_EYE_LEFTRIGHT].attach(  PIN_EYE_LEFTRIGHT);
    servos[INDEX_JAW].attach(            PIN_JAW);

    jointList[INDEX_HEAD_TILT]      = new Joint("head_tilt",           -0.30f,  0.30f,  INDEX_HEAD_TILT,      MIN_ANGLE_HEAD_TILT,      MAX_ANGLE_HEAD_TILT, PIN_HEAD_TILT);
    jointList[INDEX_HEAD_UPDOWN]    = new Joint("head_updown",         -0.30f,  0.30f,  INDEX_HEAD_UPDOWN,    MIN_ANGLE_HEAD_UPDOWN,    MAX_ANGLE_HEAD_UPDOWN, PIN_HEAD_UPDOWN);
    jointList[INDEX_HEAD_LEFTRIGHT] = new Joint("head_leftright",      -1.57f,  1.57f,  INDEX_HEAD_LEFTRIGHT, MIN_ANGLE_HEAD_LEFTRIGHT, MAX_ANGLE_HEAD_LEFTRIGHT, PIN_HEAD_LEFTRIGHT);
    jointList[INDEX_EYES_UPDOWN]    = new Joint("eyes_updown",         -0.45f,  0.45f,  INDEX_EYES_UPDOWN,    MIN_ANGLE_EYES_UPDOWN,    MAX_ANGLE_EYES_UPDOWN, PIN_EYES_UPDOWN);
    jointList[INDEX_EYE_LEFTRIGHT]  = new Joint("eye_leftright",       -0.45f,  0.45f,  INDEX_EYE_LEFTRIGHT,  MIN_ANGLE_EYES_LEFTRIGHT, MAX_ANGLE_EYES_LEFTRIGHT, PIN_EYE_LEFTRIGHT);
    jointList[INDEX_JAW]            = new Joint("jaw",                  0.00f,  0.15f,  INDEX_JAW,            MIN_ANGLE_JAW,            MAX_ANGLE_JAW, PIN_JAW);
}

Joint* findJointByName(char* name) {
    for (unsigned int i = 0; i < NUM_SERVOS; i++) {
        if (strcmp(name, jointList[i]->name) == 0) {
            return jointList[i];
        };
    }
    return NULL;
}

Joint* findJointByPinString(char *name) {
    for (unsigned int i = 0; i < NUM_SERVOS; i++) {
        if (atoi(name) == jointList[i]->servoPin) {
            return jointList[i];
        };
    }
    return NULL;
}

/**
 * Servo callback with given joint state command
 */
void servoCallback(const sensor_msgs::JointState &cmd_msg) {
    digitalWrite(13, HIGH - digitalRead(13));  //toggle led

    for (unsigned int i = 0; i < cmd_msg.name_length; i++) {
        // Retrieve joint configuration
//        Joint* joint = findJointByName(cmd_msg.name[i]);
        Joint* joint = findJointByPinString(cmd_msg.name[i]);
        if (joint != NULL) {
            // Move servo to specified position
            servos[joint->servoIndex].write(joint->convertJointPositionToServoAngle(cmd_msg.position[i]));
        }
    }
}

ros::Subscriber<sensor_msgs::JointState> sub("joint_command_pins", servoCallback);

void setup() {
    pinMode(13, OUTPUT);
    nh.initNode();
    nh.subscribe(sub);

    initServosJoints();
}

void loop() {
    nh.spinOnce();
    delay(1);
}

//
//Servo pinNine;  // create servo object to control a servo
//Servo pinTen;  // create servo object to control a servo
//// twelve servo objects can be created on most boards
//
//int pos = 0;    // variable to store the servo position
//bool isSweeping = false;
//
//void setup() {
//    pinNine.attach(9);  // attaches the servo on pin 9 to the servo object
//    pinTen.attach(10);  // attaches the servo on pin 9 to the servo object
//    isSweeping = false;
////    isSweeping = true;
//}
//
//void loop() {
//    int min_leftright = 50;
//    int max_leftright = 130;
//
//    if (isSweeping) {
//        for (pos = min_leftright; pos <= max_leftright; pos += 1) {
//            pinNine.write(pos);
//            delay(20);
//        }
//        for (pos = max_leftright; pos >= min_leftright; pos -= 1) {
//            pinNine.write(pos);              // tell servo to go to position in variable 'pos'
//            delay(20);                       // waits 15ms for the servo to reach the position
//        }
//    } else {
//        int angle = 50;
//        pinNine.write(angle);
//        delay(100);
//
//    }
//    pinTen.write(90);
//
//}
