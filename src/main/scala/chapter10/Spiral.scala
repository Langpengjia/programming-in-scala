package chapter10

import Element.elem

object Spiral {


  val space = elem(" ")
  val corner = elem("+")

  def spriral(nEdges: Int, direction: Int): Element = {
    if (nEdges == 1)
      elem("*")
    else {
      val sp = spriral(nEdges = 1, (direction + 3) % 4)

      def verticalBar = elem('|', 1, sp.height)

      def horizontalBar = elem('-', sp.width, 1)

      if (direction == 0)
        (corner beside horizontalBar) above (sp beside space)
      else if (direction == 1)
        (sp above space) beside (corner above verticalBar)
      else
        (verticalBar above corner) beside (space above sp)
    }
  }


  def main(arr:Array[String]): Unit ={
    val nSides = 11
    println(spriral(nSides,0))
  }
}
