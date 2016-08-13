# Roc message types

Roc uses the following three message types:
motion, movement and command.

A motion contains the information of a single motion for a specific part of the head.
The movement message consists of 6 motion, one for each part of the head. 
A movement is meant to be executed in parallel, so all motions of a movement are moving in parallel.
The command message is a list of movements, were the movement are executed sequentially.

## Installation 

http://wiki.ros.org/ROS/Tutorials/CreatingMsgAndSrv

