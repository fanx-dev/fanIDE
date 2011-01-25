#! /usr/bin/env fan
//
// Copyright (c) 2008, Brian Frank and Andy Frank
// Licensed under the Academic Free License version 3.0
//
// History:
//   10 Jun 08  Brian Frank  Creation
//

using gfx
using fwt

**
** FwtHello is as simple as it gets
**
class FwtHello
{
  Void main()
  {
    dsl := DSL<|Hello|>
    
    override toStr() {super.toStr}

    Window
    {
      size = Size(300,200)
      Label { text = "Hello world"; halign=Halign.center },
    }.open
  }
}