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

Each Roc program is compiled to a human readable form using JSON. The resulting JSON file uses the [Facial Action Coding System (FACS)](https://de.wikipedia.org/wiki/Facial_Action_Coding_System) for encoding the different head parts. Currently the language supports a small subset of FACS which is based on the different head parts of the anthropomorphic robot [InMoov](http://inmoov.fr). Each Roc command is mapped to a specific FACS Action Unit and is combined with timing information. For using Roc in a robotic system, the Roc language output has to be parsed and mapped to specific motor positions. In order to demonstrate the abilities of the language a demonstration system based on the head of InMoov was created. The demo system parsed the output and moves the servos accordingly. 

In order to control the robot with Roc, the RocController has to be started. The controller listens to Roc output files by creating a folder watchdog, which listens to changes on the src-gen folder (default) of a Roc language project (using Eclipse IDE with the Roc language plugin installed). 
The controller than calculates a movement trajectory for each joint in the head and sends positional information to the robot (both real-life and simulated) by using the message mechanism provided by the [Robot Operating System (ROS)](http://www.ros.org/).

## Example Program
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

## Installation
The Roc language can be used by using the provided Eclipse plugin. For controlling the head of the robot InMoov (simulated and real-life) the [Roc demonstration project](./RocDemo) needs to be installed. 

#### Roc language 
Following steps are necessary for using the Roc language plugin:
1. Install Eclipse 
2. Add Roc Update site to Eclipse
3. Install Roc language plugin
4. Use the language by creating a project

#### Roc demonstration
The demonstration consists of a simulation of the robot InMoov and a 3D print of the InMoovs' head. 

###### Prerequisites
In order to use the demonstration system, ROS has to be installed. Please see [www.ros.org](http://www.ros.org/) for a detailed installation instruction. ROS works best under Ubuntu Linux. For Roc, Ubuntu 14.x in combination with ROS indigo is suggested.

Following steps are necessary for controlling InMoov:
1. Install InMoov simulation
2. Install Roc node which is used for controlling the simulation and robot 
3. For the real-life robot: Flash Arduino code 

##### 1. Install InMoov simulation
##### 2. Install Roc node
##### 3. (Optional) Flash Arduino code 

## Usage


## Support and Contribution
Contributions to the Roc languages are welcome. Changing the language and its features is described under [Language Development](./RocLang).

Please create a pull request stating with a short description of your changes. 

If you want additional features or if you have questions, please create an issue with details.

## License 
MIT License

Copyright (c) [2016] [Ilia Dobrusin]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.