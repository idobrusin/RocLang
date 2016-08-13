# Roc Controller

The Roc controller is a ROS node which creates a watchdog for a given folder and listens to inputs from Roc lang.

## ROS topics
The node publishes on the TODO topic. The message types are located in the `msg` folder.

## Installation
1.Copy the contents of the RocDemoController folder to youtr catkin workspace src directory (typically `~/catkin_ws/src`).
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
rosrun roc Watchdog.py
```
Use Watchdog.py -h to see usage help.

## Troubleshooting
#### Error - not executable
Try granting execution right to Watchdog.py
```
chmod +x Watchdog.py
```