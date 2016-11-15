#ifndef MYTEST_JOINT_H
#define MYTEST_JOINT_H

/**
 * Basic joint class which contains all neccessary properties of a joint / servo relationship
 */
class Joint {
  public:
    Joint(const char *name, float jointMinPosition, float jointMaxPosition, int servoIndex, float servoMinAngle, float servoMaxAngle);

    // Members
    const char *name;
    float jointMinPosition;
    float jointMaxPosition;
    int servoIndex;
    float servoMinAngle;
    float servoMaxAngle;

    // Methods
    int convertJointPositionToServoAngle(float position);
};


#endif //MYTEST_JOINT_H
