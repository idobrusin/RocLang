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

In order to control a robot head, a [demonstration system](./RocDemo) is created based on the head of the robot [InMoov](http://inmoov.fr), an anthropomorphic life-size robot which can be printed with an off-the-shelf 3D printer. The demonstration system uses the output of the language which a serialized representation of the movement instructions encoded with JSON for moving the different parts of the head. The system consists of the robot head and a simulation, which is an integral part of the working system. 

# Installation
The Roc language can be used by using the provided Eclipse plugin. For controlling the head of the robot InMoov (simulated and real-life) the [Roc demonstration project](./RocDemo) needs to be installed. 

## 1. Roc language installation
The language can be used via an Eclipse plugin. Before installing the language plugin, the Xtext plugin has to be installed. Follow the instruction provided on the [Xtext homepage](https://eclipse.org/Xtext/download.html).  
In case the update site of Xtext doesn't work, try to use one of the sites listed [here](https://www.eclipse.org/modeling/tmf/updates/).  

The are two possible methods to install the plugin: via an update site or as a manual plugin installation. It is recommended to use the update site.  

### Regular installation via Update Site
  * Open Help -> Install new Software.
  * Click add to add a repository
  * Use the following URL: https://idobrusin.github.io/RocLang/update/site.xml
  * Install Roc feature and restart Eclipse.
  * Confirm with yes, when asked to convert project to Xtext project.  

Important note: Eclipse has to to run using Java 1.8, otherwise the Roc plugin wont work.

### Alternative: Manual installation
Extract the RocLang.zip and place contents to the Eclipse dropins folder.  
Following folder structure should be present: dropins/plugins/*Roc.jars.  
In order to reload plugins, start Eclipse with -clean option.
```
./opt/eclipse/eclipse -clean
```

## 2. Roc demonstration installation
The demonstration consists of a simulation of the robot InMoov and a 3D print of the InMoovs' head. 

### Prerequisites
In order to use the demonstration system, ROS has to be installed. Please see [www.ros.org](http://www.ros.org/) for a detailed installation instruction. ROS works best under Ubuntu Linux. For Roc, Ubuntu 14.x in combination with ROS indigo is suggested.

### Installation
#### 1. Install InMoov simulation
  - git clone https://github.com/alansrobotlab/inmoov_ros.git in the catkin workspace src folder, so in the end, the src folder contains inmoov_description etc.
```bash
    ~/catkin_ws  # use your workspace location
    catkin_make
    catkin_install
    source ./devel/setup.bash
```
Note: source the /devel/setup.bash in your .bashrc, otherwise these steps need to performed each time you want to run the simulation.

#### 2. Install Roc node
##### Python Prerequisites
Following python packages are needed for operating the robot:
  * `yaml`
  * `watchdog`
  * `rospy`  
  * `numpy`  
  * `scipy`  
  * `matplotlib`  
Install them via `pip`/`pip3`.

##### Create Roc node
Copy the contents of the `/roc_node` folder to your catkin workspace `src` directory (typically `~/catkin_ws/src`).  

Generate message classes by running
```
cd ~/catkin_ws  # use your workspace location
catkin_make install
```  
  
Source the devel folder
```
cd ~/catkin_ws  # use your workspace location
source ./devel/setup.bash
```

#### 3. (Optional) Install Arduino libraries and flash Arduino
In order to communicate with the Arduino via ROS rosserial has to be installed.
##### Install platformIO
The Arduino should be flashed by using [platformIO](http://platformio.org/).
Install the platformIO CLI following these [instructions](http://docs.platformio.org/en/stable/installation.html#super-quick-mac-linux).  

platformIO can also be used in an IDE (see [platformIO integration](http://platformio.org/get-started/integration) for details).

##### Install rosserial
To program the Arduino, `rosserial` must be installed and installed in the sketchbook/libraries folder.
[Installation instructions](http://wiki.ros.org/rosserial_arduino/Tutorials/Arduino%20IDE%20Setup)


##### Flash Arduino using platformIO
Use the following commands to flash the firmware on the Arduino.
  * `platformio run --target upload` to build and upload firmware to all devices specified in the `platformio.ini` file (see [PlatformIO Quickstart](http://docs.platformio.org/en/stable/quickstart.html) for details)
  * `platformio run -e uno -t upload` to build and upload to a single environment (here: Arduino UNO).
For a more detailed instruction on how to use PlatformIO see [PlatformIO documentation](http://docs.platformio.org/en/stable/).

## Usage
### Create a Roc project in Eclipse
  1. Create a new project in your Eclipse Workspace (File->New->Java Project or File->New->Project).
  2. Create a .roc file
  3. Create a src-gen folder, this will be used as the output for the compiler and should be registered in the RobotController as the folder to watch.   

Important note: When using the plugin, Eclipse asks if the project should be converted to a Xtext project. Press Yes, otherwise the code generation will not work properly.

##### Options
It is possible to change the output folder of the language (default src-gen in the project folder).

### Run the simulation
Make sure ROS is running:
```bash
roscore
```

```bash
    cd ~/catkin_ws/src/inmoov_description  # use your workspace location
    roslaunch inmoov_description display.launch model:=robots/inmoov.urdf gui:=True
```

### Run Roc control node
Make sure ROS is running:
```
roscore
```

Run node:
```
rosrun roc RocController.py -p <path_to_src-gen>

# Example: Listen to file changes in the current folder (also default).
rosrun roc RocController.py -p ./
```
#### Arguments 
1. `-f` or `--file`: Reads in Roc output file (JSON) and sends it immediately via  ROS.
2. `-p` or `--path`: Path which points to the output folder of the Roc IDE. Default: `.`
3. `-P` or `--pattern`: File pattern to be monitored (one or more). Default: `*.json`

Use RocController.py -h to see usage help and arguments.

#### Troubleshooting
Following package needs to be installed for python3:
  1. `sudo pip3 install catkin_pkg` 
Install one by one and try to run the script until all dependencies are resolved.  

The path for the robot configuration located in roc_node/scripts/config/config.json has to be adjusted in RocController.py.

### Run motion control node
```
roscore
```

Run node:
```
rosrun roc MotionController.py
```

### Start Arduino ROS node
Start rosserial in order to forward messages to Arduino
```bash
rosrun rosserial_python serial_node.py <DEVICE_LOCATION>

# Linux example
rosrun rosserial_python serial_node.py /dev/ttyACM0 # Linux
```
Some possible device locations:

Mac OS X: `/dev/tty.usbmodemFD121`

Ubunutu : `/dev/ttyACM0`

### Control robot
After all previous programs are running (Eclipse, simulation, Roc control node and optionally the Arduino node), it is possible to write a Roc program in Eclipse. After saving the `.roc` file the robot should move accordingly.

## Troubleshooting
### Roc language
Some editors don't save files upon saving, but instead replace the file with a cached file. When using the watchdog without Eclipse, make sure that the editor performs a modification on the file, otherwise changes will not be registered. Known editors with this behaviour: vim and gedit. It is possible to change this behavior in the editor settings.

### Arduino
#### Permission denied for USB device (Ubuntu Linux)
http://arduino-er.blogspot.de/2014/08/arduino-ide-error-avrdude-seropen-cant.html

```bash
sudo usermod -a -G dialout <username>
```

```bash
# /dev/ttyACM0 is the Linux device
sudo chmod a+rw /dev/ttyACM0
```


## Support and Contribution
Contributions to the Roc languages are welcome. Changing the language and its features is described under [Language Development](./RocLang).

Please create a pull request stating with a short description of your changes. 

If you want additional features or if you have questions, please create an issue with details.

## License 
MIT License

Copyright (c) 2016 Ilia Dobrusin

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