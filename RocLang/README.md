# Robot Control language - Language project
## Usage and language structure
Follow install instructions to use the language.

The language has a sentence like syntax, where you can write the command which should be performed. Currently commands for moving a robot head are implemented.  
A command has the following base form:
`<intensity> <action> <direction> for <duration> <unit>.`  
Commands consist of the following base actions:
  - `turn head`
  - `tilt head`
  - `turn eyes`
  - `drop jaw`

Some commands have a direction, when it makes sense (left, right, up, down).  
Also each command can have an intensity, so the robot will move to some extend. The intensities are (in order from low to high):
  - `trace of`
  - `slightly`
  - `pronounced`
  - `severe`
  - `maximum`

When no intensity is provided, `pronounced` is used as a default value.  
Each command can have a duration or speed information. The speed information has the following form:
`for <speed_type> speed`. Durations have the following form: `for <duration> <unit>`.  
Following speed types are supported, where `normal` is the default value if no speed or duration information is provided.
  - `slowest`
  - `slow`
  - `normal`
  - `fast`
  - `full`

Commands can also be chained together with the keyword `and` and will be executed in parallel.
All commands have to end with a period `.`.  

Here is an example command in Roc:
```
// First, turn head and eyes
slightly turn head left for 1000 milliseconds and
severe turn eyes right with full speed.

// After the first movement, open the jaw.
maximum drop jaw for 1000 milliseconds.
```

## Language development
The language is based on the Eclipse Xtext Project, and can be developed in Eclipse.

To launch a development instance of Eclipse where the language is installed, right-click on the Roc project (robot.control.roc) and select Run.

##### Prerequisites
  * Xtext plugin ([download and instructions](https://eclipse.org/Xtext/download.html "Xtext download"))
  * Install Eclipse Plug-in Development Environment (In Eclipse : Help-> Install new Software -> Filter for 'Eclipse plug-in development environment' -> Install

Note: tested with Eclipse Mars, will probably also work with other Eclipse Versions.

### Development

#### Changing the language grammar
The language grammar is defined in [Roc.xtext](./robotcontrol.parent/robotcontrol/src/robot/control/Roc.xtext).
After changing the grammar, the Xtext artifact need to be (re-) generated (Right-click on `Roc.xtext` -> `Run As` -> `Generate Xtext Artifacts`). This will auto generate the model classes used by the parser.

#### Changing the ouput format
The language plugin uses an [converter](./robotcontrol.parent/robotcontrol/src/robot/control/conversion/MovementConverter.java) to convert the abstract syntax tree (AST) to a `JSON` file. The converter traverses the AST and converts the object properties to a `JSON` object and writes the result to the `/src-gen` folder (default behavior, can be changed via Eclipse Settings when using the plugin).

The generation itself is handled by the [generator class](./robotcontrol.parent/robotcontrol/src/robot/generator/RocGenerator.xtend).

#### Update update-site
To update the update site, open the site.xml file in Eclipse and press build all to rebuild the update site folder.


Note: How to create an Eclipse update site project for Xtext based languages:
https://charandeepmatta.com/2012/09/01/how-to-generate-eclipse-plugin-for-your-dsl-written-in-xtext/
