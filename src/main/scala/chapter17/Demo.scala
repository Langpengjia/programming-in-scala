package chapter17

import scala.collection.immutable.Queue
import scala.collection.mutable.ListBuffer

object Demo extends App {



 val buff = new ListBuffer[Int]

  buff += 1
  buff += 2

  println(buff)

  val s = 3 +: buff

  println(s)

  println(buff.length)

  val empty = Queue.apply()
  val c = empty.enqueue(1)
  println(c.dequeue)

  val map = Map.empty[String,String]
  val cmap = map + ("1" ->"v1")

  println(cmap("1"))



  var mutibaleSet = Set("1","2","3","4")
  println(mutibaleSet.size)
  mutibaleSet ++= List("5","6","7","1")

  println(mutibaleSet.size)







}
