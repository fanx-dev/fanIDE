#! /usr/bin/env fan
//   10 Jun 08  Thibaut C
using fwt

** Dummy example for Syntax highlighting testing.
class FwtHello
{
  static Void main()
  {
    Window{size = Size(300,200); Label {text = "Hello world"},}.open
    dsl := DSL<|Hello|>; 
  }
  override toStr() {super.toStr}
}