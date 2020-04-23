## FanIDE

Netbeans plugin to support the Fantom/Fanx Language.

It forked from tcolar's FantomIDE (http://fantomide.colar.net/)

### Features
- Syntax Highlighting
- Semantic Error
- Completion with Doc
- Go to declaration
- Debugging
- Outline view

### Screenshot
![image](https://raw.githubusercontent.com/fanx-dev/FanIDE/master/screenshot.png)


### Installing
#### Download
https://github.com/fanx-dev/fanIDE/releases

#### Install Apache Netbeans(at least 11.3)
https://netbeans.apache.org/download/index.html

#### Install as plugin
Apache Netbeans > Tools > Plugins > Downloaded > Add Plugins

#### Config Fanx/Fantom Env Path
Apache Netbeans > Tools > Preferences > Fantom

#### Set the theme
Apache Netbeans > Tools > Options > Appearance > Look and Feel > FlatLaf Light.


### Build from Source
clone 'https://github.com/fanx-dev/fanx.git'.
```
cd fanx/src/parser
fanb pod.props
fan build::JarDistMain parser parser::IncCompiler.main
```
copy parser.jar to module/release/modules/ext/

