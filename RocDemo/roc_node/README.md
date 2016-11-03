# Roc Controller

The Roc controller is a ROS node which creates a watchdog for a given folder and listens to inputs from Roc lang.

## ROS topics
The node publishes on the `/roc_command` topic. The message types are located in the `msg` folder.

## Installation
1.Copy the contents of the /roc_node folder to your catkin workspace src directory (typically `~/catkin_ws/src`).
2. Generate message classes by running
```
cd ~/catkin_ws
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
rosrun roc RocController.py 
```
#### Arguments 
1. `-f` or `--file`: Reads in Roc output file (JSON) and sends it immediately via  ROS.
2. `-p` or `--path`: Path which points to the output folder of the Roc IDE. Default: `.`
3. `-P` or `--pattern`: File pattern to be monitored (one or more). Default: `*.json`

Use RocController.py -h to see usage help and arguments.

## Troubleshooting
#### Error - not executable
Try granting execution right to RocController.py
```
chmod +x RocController.py
```
