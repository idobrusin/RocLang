# Roc Controller

The Roc controller is a ROS node which creates a watchdog for a given folder and listens to inputs from Roc lang.

## ROS topics
The node publishes on the `/roc_command` topic. The message types are located in the `msg` folder.

## Troubleshooting
#### Error - not executable
Try granting execution right to RocController.py
```
chmod +x RocController.py
```
