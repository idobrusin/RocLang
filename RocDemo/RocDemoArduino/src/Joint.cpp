#include "Joint.h"

/**
 * Use Arduino map method, but with float args
 */
float mapfloat(float x, float in_min, float in_max, float out_min, float out_max)
{
    return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
}

Joint::Joint(const char *name, float jointMinPosition, float jointMaxPosition, int servoIndex, int servoMinAngle, int servoMaxAngle) {
    this->name = name;
    this->jointMinPosition = jointMinPosition;
    this->jointMaxPositiom = jointMaxPosition;
    this->servoIndex = servoIndex;
    this->servoMinAngle = servoMinAngle;
    this->servoMaxAngle = servoMaxAngle;
}

float Joint::convertJointPositionToServoAngle(float position) {
    return mapfloat(position, this->jointMinPosition, this->jointMaxPositiom, this->servoMinAngle, this->servoMaxAngle);
}





