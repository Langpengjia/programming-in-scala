package chapter12

trait Incrementing extends IntQueue {
  abstract override def put(x: Int): Unit = super.put(x + 1)
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit = if (x >= 0) super.put(x)
}
