package chapter12

trait DoubleLine extends IntQueue {

  abstract override def put(x: Int): Unit = (super.put(2*x))

}
