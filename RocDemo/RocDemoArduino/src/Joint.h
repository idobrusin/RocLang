#ifndef MYTEST_JOINT_H
#define MYTEST_JOINT_H

/**
 * Basic joint class which contains all neccessary properties of a joint / servo relationship
 */
class Joint {
  public:
    Joint(const char *name, float jointMinPosition, float jointMaxPosition, int servoIndex, int servoMinAngle, int servoMaxAngle);

    // Members
    const char *name;
    float jointMinPosition;
    float jointMaxPositiom;
    int servoIndex;
    int servoMinAngle;
    int servoMaxAngle;

    // Methods
    float convertJointPositionToServoAngle(float position);
};


#endif //MYTEST_JOINT_H
