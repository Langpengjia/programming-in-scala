package main.chapter8

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int): Unit = {

    def processLine(line: String): Unit = {
      if (line.length > width) println("filename: " + line.trim)
    }

    val source = Source.fromFile(filename, "GB2312")
    for (line <- source.getLines())
      processLine(line)
  }

  var increase = (x: Int) => x + 1

  var incease2 = (x: Int) => {
    println(x)
    println(x + 1)
    println("done")
    x + 1
  }


}
