# Demonstration project for Robot control language
This project contains a demonstration system for the robot control language and contains two subproject. The Arduino demo contains code to program an Arduino to receive [ROS](http://www.ros.org/) messages, which are then translated to servo angles.
The demo controller uses the ROS messaging mechanism to send commands to a RVIZ demo and/or an Arduino .

## MotionController
The MotionController subscribes to the `/roc_message` ROS topic and adds them to a queue, which is then used to send the movement commands to the robot or simulation at the correct time. The controller applies a smoothing to the movements of each joint for a better movement trajectory.
The ROS topic `/joint_command` with the message type `sensor_msgs/JointState` is used to encode the command.

## Manually send positions to simulation and Arduino
You can either use the GUI or send a command via Terminal
To send a command via terminal use the following command:
```bash
rostopic pub -r 20 /joint_command sensor_msgs/JointState '{header: auto, name: [''], position: [], velocity: [], effort: []}'
```
