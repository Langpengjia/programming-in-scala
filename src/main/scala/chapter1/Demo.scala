package chapter1


object Demo extends App {


  println(1 :: List(2, 3))
  val a = 1 :: 2 :: 3 :: 3 :: 3 :: 3 :: 3 :: 4 :: Nil

  println(a.count(s => s == 3))


}
