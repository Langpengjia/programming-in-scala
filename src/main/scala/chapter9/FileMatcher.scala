package chapter9

import java.io.File

object FileMatcher {

  private def filesHere = (new File(".")).listFiles

  def filesEnding(query: String): Unit = {
    for (file <- filesHere; if file.getName.endsWith(query)) yield file
  }


  def filesMatching(query: String, matcher: (String, String) => Boolean): Unit = {
    for (file <- filesHere; if matcher(file.getName, query)) yield file
  }


  def filesContaining(query: String) = filesMatching(query, _.contains(_))


  def twice(op: Double => Double, x: Double) = op(op(x))


  def main(args: Array[String]) = {
    //don't run
    //    filesMatching("a",_.startsWith(_))

    val ss = List(1, 2, 3, 4, 5, 6, 7, 8)
    println(ss.exists(_ < 5))

    println(twice(_ + 1, 5))

    val sdf = "NaN"
    println(sdf.toDouble.isNaN)


  }


}
