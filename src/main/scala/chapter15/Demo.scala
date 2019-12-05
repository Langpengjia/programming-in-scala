package chapter15

import Math.{E, PI}

object Demo {


  def descrip(x: Any) = x match {
    case 5 => 6
    case 6 => 5
    case "hello,friends!" => "有朋自远方来，不亦说乎"
    case "呵呵" => 2333333333L
    case "中午吃什么？" => "喝粥吧"
  }

  def test2 = E match {
    case PI => "strange math? PI=" + PI
    case _ => "OK "+PI
  }

  def test3(x:Any) =  x match {
    case List(0,_,1) => "start with 0 and end with 1"
    case List(0,_,_,_,_,_Z,1) => "hahha"
    case _ => 0
  }

  def calsize(x:Any) = x match {
    case s:List[_] =>s.length
    case s:String => s.length
    case s:Map[_,_] => s.size
    case s:Array[_] => s.length
    case _ => 0
  }

  def main(args: Array[String]) = {
    println(descrip("中午吃什么？"))
    println(test2)
    println(test3(List(0,2,1)))
    println(test3(List(0,2,2,2,2,2,1)))

  }

}
