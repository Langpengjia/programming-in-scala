package chapter8

import main.chapter8.LongLines

object Chapter8Test extends App {


  LongLines.processFile("D:\\test.txt",4)


  val someNumbers = List(-11,-10,-5,0,5,10)
  someNumbers.foreach(println)

}
