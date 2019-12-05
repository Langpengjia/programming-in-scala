package chapter9

import java.io.{File, PrintWriter}

object Chapter9Test {

  var assert = true

  def withPrintWriter(file: File, op: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }


  def byNameAssert(predicate: => Boolean): Unit = {
  }


  def main(arr:Array[String]): Unit ={
    byNameAssert(5>3)
  }

}
