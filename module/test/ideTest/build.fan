// To change this License template, choose Tools / Templates
// and edit Licenses / FanDefaultLicense.txt
//
// History:
//   2-Apr-2010  tcolar  Creation
//
using build

**
** Build: ideTest
**
class Build : BuildPod
{
  new make()
  {
    podName = "ideTest"
	summary = "ideTest"
    depends = ["sys 1.0"]
    srcDirs = [`fan/`, `test/`]
  }
}
