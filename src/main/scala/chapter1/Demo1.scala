package chapter1

class Demo1 {


  def demo = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japen" -> "Tokyo")
    capital += ("China" -> "Beijing")

    println(capital("China"))

  }

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)



  def demo2 = {
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val one2Four = oneTwo ::: threeFour
    println("oneTwo : " + oneTwo)
    println("threeFour : " + threeFour)
    println("one2Four : " + one2Four)

  }




}
