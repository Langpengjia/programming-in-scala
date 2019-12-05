package chapter12

object Demo extends App {


//  val myqueue = new MyQueue
//  myqueue.put(10)
//
//  println(myqueue.get())

  //特质混入顺序不能随意指定
  //尤其其中包含super方法（线性化）
  val myqueue = new BasicIntQueue with DoubleLine with Incrementing


    myqueue.put(10)

    println(myqueue.get())

}
