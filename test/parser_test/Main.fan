// To change this License template, choose Tools / Templates
// and edit Licenses / FanDefaultLicense.txt
//
// History:
//   30-Jan-2010  tcolar  Creation

**
** Main
**
class Main
{

  **
  ** Main method
  **
  static Void main()
  {
    list := ["one", "two", "three"]
    f := |->| { echo("hi there") }
    f.isImmutable
    f2 := |Int a, Int b->Int| { return a + b }
    nine := f2(4,5)
    counter := 0
    f3 := |->Int| { return ++counter }
    f3.isImmutable
    evens := list.findAll(|Int v->Bool| { return v%2==0 })
    evens2 := list.findAll() |Int v->Bool| { return v%2==0 }
    evens3 := list.findAll |Int v->Bool| { return v%2==0 }
    s := evens3.size
    list.each |Str val, Int index| { echo("$index = $val") }
    list.each |Str v, Int i| { echo("$i = $v") }
    list.each |v, i| { i.abs }

    ["a", "b", "c"].each |Str s| { echo(s.upper) }
    ["a", "b", "c"].each { echo(it.upper) }
    ["a", "b", "c"].each { echo(upper) }
    ["a", "b", "c"].each { echo(it.upper) }

    list9 := Str[,].with { filla(x,3) }
    list10 := Str[,] { fill("x", 3) }

    b := Button {text=""}
  }


}


