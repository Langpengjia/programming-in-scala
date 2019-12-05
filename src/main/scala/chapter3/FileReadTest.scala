package chapter3

import scala.io.Source

object FileReadTest extends App {


  val source = Source.fromFile("D:/test.txt")

  for (line <- source.getLines)
    println(line.length)


}
