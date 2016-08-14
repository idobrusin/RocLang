# Demonstration project for Robot control language
This project contains a demonstration system for the robot control language and contains two subproject. The Arduino demo contains code to program an Arduino to receive [ROS](http://www.ros.org/) messages, which are then translated to servo angles.
The demo controller uses the ROS messaging mechanism to send commands to either a RVIZ demo or an Arduino.

## Controller
### Prerequisites
#### Robot control language
Install the Roc Eclipse plugin. When saving a `.roc` file in Eclipse, the parser will create a `JSON` file in the src-gen directory.
#### Dependencies

##### ROS:
The project requires a ROS installation (tested with ROS indigo).
##### Rosserial
`rosserial` is used for the communication between the Arduino and the controlling computer.
##### python packages:
  * `yaml`
  * `watchdog`
  * `rospy`

### Usage
The Roc controller is a ROS node which listens to file changes.

Before using the demonstration system an instance of ROS has to run. Start ROS with the `roscore` command in a Terminal.

#### Roc Controller
The roc controller node creates a file system watchdog, which should listen to changes in the Roc project `/src-gen` directory.

To start the watchdog run the script with the path of the Eclipse workspace location for `/src-gen`
```bash
rosrun roc RocController.py <PATH_TO_SRC-GEN>
```

When a file change is registered, the watchdogs send a ROS message with the file content to following topic: <TODO>

###### Command line arguments
Run `python3 ./roc_node/sripts/RocController.py --help ` to see a complete list of arguments.

###### Troubleshooting
Some editors don't save files upon saving, but instead replace the file with a cached file. When using the watchdog without Eclipse, make sure that the editor performs a modification on the file, otherwise changes will not be registered. Known editors with this behaviour: vim and gedit. It is possible to change this behaviour in the editor settings.

#### Scheduler
The scheduler subribes to the `/roc_message` ROS topic and adds them to a queue, which is then used to send the movement commands to the robot or simulation at the correct time.
The ROS topic `/joint_command` with the message type `sensor_msgs/JointState` is used to encode the command.

## Joint state command
The interface between the controller and the robot is defined by the ROS `/joint_command` topic definition.

## Inmoov Robot (Arduino) and Inmoov Simulation
Currentlly it is possible to control a real robot via Arduino or a 3D simulation of the robot InMoov.

### Arduino
Start rosserial in order to forward messages to Arduino
```
rosrun rosserial_python serial_node.py <DEVICE_LOCATION>
```
Some possible device locations:

Mac OS X: `/dev/tty.usbmodemFD121`

Ubunutu : `/dev/ttyACM0`

#### Install rosserial
To program the Arduino, `rosserial` must be installed and installed in the sketchbook/libraries folder.
[Installation instructions](http://wiki.ros.org/rosserial_arduino/Tutorials/Arduino%20IDE%20Setup)

#### Troubleshooting
#### Permission denied for USB device (Ubuntu Linux)
http://arduino-er.blogspot.de/2014/08/arduino-ide-error-avrdude-seropen-cant.html

```bash
sudo usermod -a -G dialout <username>
```

```bash
sudo chmod a+rw /dev/ttyACM0
```
### Simulation

#### Configuration:
  - git clone https://github.com/alansrobotlab/inmoov_ros.git in the catkin workspace src folder, so in the end, the src folder contains inmoov_description etc.
```bash
    cd <catkin workspace>
    catkin_make
	catkin_install
	source ./devel/setup.bash
```
Note: source the /devel/setup.bash in your .bashrc, otherwise these steps need to performed each time you want to run the simulation.

#### Subscribe to joint commands
To see joint published joint commands use the following subscriber:
```bash
	rostopic echo joint_states sensor_msgs/JointState
```

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
