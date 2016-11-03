# Robot control language (Roc)
This repository contains the sources for the Robot control language (Roc), a language based on structured English sentences which can be used to control anthropomorphic robot heads. The language was developed as part of my Bachelor's thesis at the [University of Freiburg](https://www.uni-freiburg.de/), Germany.

The Roc language allows the control of robotic heads by writing structured English sentences of the following form:
```
slightly turn head left with full speed. 
```
Each sentence written in the language represents a movement which should be performed by the head. In order to move several parts in parallel, movement instructions can be concatenated by using the keyword `and`.

A Roc sentence has the following form: 
```
<Intensity> <Action> <Direction> <Duration / Speed>. 
```
Intensity and Duration information are optional and will be filled with default values if they are omitted.

## Example 
The following example program would result in the movement sequence displayed bellow.
```
turn head left.
turn head right.
neutral face.
```
The Roc compiler creates a JSON file representing the movements which are encoded with the [Facial Action Coding System (FACS)](https://de.wikipedia.org/wiki/Facial_Action_Coding_System).
The demonstration system consumes the file and send movement instructions to the robot via the [Robot Operating System (ROS)](http://www.ros.org/).
![Example movement of the robot head InMoov](/docs/images/roc_example.jpg)

## Project structure
The main language project consists of the language definition created with the Xtext language workbench. The language can be used as an Eclipse plugin which can be installed via the provided Eclipse update site. See [Roc language project](./RocLang) for a detailed instruction and further information about the language development. 

In order to control a robot head, a demonstration system is created based on the head of the robot [InMoov](http://inmoov.fr), an anthropomorphic life-size robot which can be printed with an off-the-shelf 3D printer. The demonstration system uses the output of the language which a serialized representation of the movement instructions encoded with JSON for moving the different parts of the head. The system consists of the robot head and a simulation, which is an integral part of the working system. 
[Roc demonstration project](./RocDemo)


