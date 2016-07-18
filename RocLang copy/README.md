# Robot Control language - Language project
## Install Robot Control Language Eclipse Plugin
The language can be used via an Eclipse plugin.
The are two possible methods to install the plugin: via an update site or as a manual plugin installation. It is recommended to use the first method.  

Important note: When using the plugin, Eclipse askes if the project should be converted to a Xtext project. Press Yes, otherwise the code generation will not work properly.

### Install via update site
  * Open Help -> Install new Software.
  * Click add to add a repository
  * Use the following URL: https://github.com/idobrusin/RocLang/raw/master/RocLang/robot.control.roc.parent/robot.control.roc.update-site
  * Install Roc feature and restart Eclipse.
  * Confirm with yes, when asked to convert project to Xtext project.

### Manual install
Export all projects as zip.
Place in eclipse dropins/ folder and extract.
(Jars should be located in folder dropins/plugins)
Restart eclipse with -clean option

## Language development
The language is based on the Eclipse Xtext Project, and can be developed in Eclipse.

### Dependencies
  * Xtext Plugin ([download and instructions](https://eclipse.org/Xtext/download.html "Xtext download"))
  * Install Eclipse Plug-in Development Environment (In Eclipse : Help-> Install new Software -> Filter for 'Eclipse plug-in development environment' -> Install

Note: tested with Eclipse Mars, will probably also work with other Eclipse Versions.

### Development

#### Changing the language grammar
The language grammar is defined in [Roc.xtext](./robot.control.roc.parent/robot.control.roc/src/robot/control/Roc.xtext).
After changing the grammar, the Xtext artifact need to be (re-) generated (Right-click on `Roc.xtext` -> `Run As` -> `Generate Xtext Artifacts`). This will auto generate the model classes used by the parser.

#### Changing the ouput format
The language plugin uses an [converter](./robot.control.roc.parent/robot.control.roc/src/robot/control/conversion/MovementConverter.java) to convert the abstract syntax tree (AST) to a `JSON` file. This behaviour can be changed in the future. The converter traverses the AST and converts the object properties to a `JSON` object and writes the result to the `/src-gen` folder (default behaviour, can be changed via Eclipse Settings when using the plugin).

The generation itself is handled by the [generator class](./robot.control.roc.parent/robot.control.roc/src/robot/generator/RocGenerator.xtend).

#### Update update-site
To update the update site, open the site.xml file in Eclipse and press build all to rebuild the update site folder.


Note: How to create an Eclipse update site project for Xtext based languages:
https://charandeepmatta.com/2012/09/01/how-to-generate-eclipse-plugin-for-your-dsl-written-in-xtext/
