### Eclipse notes:
For Development:
Tested with Eclipse Mars
Install Xtext
Install Eclipse Plug-in Development Environment


### Eclipse Installation plugin
Export all projects as zip.
Place in eclipse dropins/ folder and extract.
(Jars should be located in folder dropins/plugins)
Restart eclipse with -clean option

Alternative:
https://charandeepmatta.com/2012/09/01/how-to-generate-eclipse-plugin-for-your-dsl-written-in-xtext/

Create update-site project.
Use update site project to deploy project.
Open site.xml and press build all to rebuild update site folder.
To import use Install new Softwar and add new Local update site. Choose folder of update site project.

Note: When asked to convert projet to Xtext project, press Yes!
#### Relevant classes:
Project:
    robot.control.RoC
        src/ folder
        robot.control.conversion
            MovementConverter
                Converts movements to json
        robot.control.conversion
            RocGenerator
                Calls movementConverter to convert movemnts.

    robot.control.Roc.ui
        robot.control.ui.contentassist.RocProposalProvider
            Provides autocomplete functionalitiy.

#### When using the Roc plugin:
    Create src-gen folder.
    When saving a .roc file, the generator will create a json file in the src-gen folder.
    Use watchdog to listen to changes in that folder.



i# Robot Control (RoC)
This project is part of the RoC ecosystem is intendet to be used as a reference implementation for controling a robot.

### Dependencies
- ROS:
Ros indigo has to be installed.
- Rosserial
rosserial is used for the communication between the components of the system.
- python packages:
yaml
watchdog
rospy



### How to

1. Run
```
roscore
```

2. cd into MessageController dir
3. Run
```
	python3 Main.py
```
Troubleshooting:
When watchdog does not register change events, check if editor is modifiying file. Some Editors swap a copy in place, rendering the watchdog useless.
4. Run
```
	python3 Scheduler.py
```
5. subscribe to /joint_command topic to see output
6. Edit json file and save
7. Message should be send and can be seen
	rostopic list /joint_command

### How to Arduino
Forward topics to arduino via command:
```
rosrun rosserial_python serial_node.py /dev/tty.usbmodemFD121
```
where dev/tty.usbmodemFD121 is the usb port of arduino


To program the Arduino, rosserial must be installed and installed in the sketchbook/libraries folder.
http://wiki.ros.org/rosserial_arduino/Tutorials/Arduino%20IDE%20Setup

Fix permissions for /dev/ttyACM0
http://arduino-er.blogspot.de/2014/08/arduino-ide-error-avrdude-seropen-cant.html

$ sudo usermod -a -G dialout <username>
$ sudo chmod a+rw /dev/ttyACM0

### Limitations
Language is stateful, so every action unit stays on its position until changed by new command.
