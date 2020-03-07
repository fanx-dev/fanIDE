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

#### Set the theme
Apache Netbeans > Tools > Options > Appearance > Look and Feel > FlatLaf Light.


### Build from source
Depends to 'https://github.com/fanx-dev/fanx/tree/master/src/parser'.
```
fanb pod.props
fan build.fan dist
```
copy parser.jar to module/release/modules/ext/

