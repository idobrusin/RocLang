# Ardiuno Code for controlling the InMoov head
For a detailed installation and usage instruction see the project root README.

## Start Arduino ROS node
Start rosserial in order to forward messages to Arduino
```bash
rosrun rosserial_python serial_node.py /dev/ttyACM0 # Linux device location
```