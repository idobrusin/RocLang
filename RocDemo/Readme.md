# Demonstration project for Robot control language
This project contains a demonstration system for the robot control language and contains two subproject. The Arduino demo contains code to program an Arduino to receive [ROS](http://www.ros.org/) messages, which are then translated to servo angles.
The demo controller uses the ROS messaging mechanism to send commands to a RVIZ demo and/or an Arduino .

## Controller
In order to use the controller please follow the [installation instructions](../).

### Usage
The Roc controller is a ROS node which listens to file changes.
Before using the demonstration system an instance of ROS has to run. 

#### Roc Controller
The roc controller node creates a file system watchdog, which should listen to changes in the Roc project `/src-gen` directory.

To start the watchdog run the script with the path of the Eclipse workspace location for `/src-gen`
```bash
rosrun roc RocController.py <PATH_TO_SRC-GEN>
```

When a file change is registered, the watchdogs send a ROS message with the file content to following topic: <TODO>

###### Command line arguments
Run `python3 ./roc_node/sripts/RocController.py --help ` to see a complete list of arguments.


#### MotionController
The MotionController subscribes to the `/roc_message` ROS topic and adds them to a queue, which is then used to send the movement commands to the robot or simulation at the correct time. The controller applies a smoothing to the movements of each joint for a better movement trajectory.
The ROS topic `/joint_command` with the message type `sensor_msgs/JointState` is used to encode the command.

## Joint state command
The interface between the controller and the robot is defined by the ROS `/joint_command` topic definition.

#### Run simulation
```bash
	cd <catkin_ws>/src/inmoov_description
	roslaunch inmoov_description display.launch model:=robots/inmoov.urdf gui:=True
```

#### Send command to simulation
You can either use the GUI or send a command via Terminal
To send a command via terminal use the following command:
```bash
rostopic pub -r 20 /joint_command sensor_msgs/JointState '{header: auto, name: [''], position: [], velocity: [], effort: []}'
```
