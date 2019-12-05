package chapter10

class Cat {

  val dangerous = false

}

//class Tiger(
//  override val dangerous: Boolean = true,
//  private var age:Int
//) extends Cat

//Tiger的另一种写法
class Tiger(param1:Boolean,param2:Int) extends Cat {
  override val dangerous: Boolean = param1
  private var age:Int = param2
}