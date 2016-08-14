# Roc Controller

The Roc controller is a ROS node which creates a watchdog for a given folder and listens to inputs from Roc lang.

## ROS topics
The node publishes on the TODO topic. The message types are located in the `msg` folder.

## Installation
1.Copy the contents of the /roc_node folder to your catkin workspace src directory (typically `~/catkin_ws/src`).
2. Generate message classes by running
```
catkin_make install
```
3. Source the devel folder
```
cd ~/catkin_ws
source ./devel/setup.bash
```

## Run node
Run node:
```
rosrun roc RocController.py <ARGS>
```
Use RocController.py -h to see usage help.

## Troubleshooting
#### Error - not executable
Try granting execution right to RocController.py
```
chmod +x RocController.py
```
