package chapter3

import java.math.BigInteger

object Demo1 extends App {

  var big = new BigInteger("123456")

  val greenString = new Array[String](3)
  greenString(0) = "Hello"
  greenString(1) = ","
  greenString(2) = "World"
  //  for (i <- 0 to 2) print(greenString(i))

  val numNames2 = Array.apply("zero", "one", "two")

  val one2three = List(1, 2, 3)
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val one2four = oneTwo ::: threeFour
  println("" + oneTwo + " and " + threeFour + " were not mutated.")
  println("Thus," + one2four + " is a new List.")

  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree

  println(oneTwoThree)

  val onetwothreefour = 1 :: 2 :: 3 :: 4 :: Nil
  println(onetwothreefour)

  println(onetwothreefour.tail)




}
