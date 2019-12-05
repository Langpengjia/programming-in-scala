package chapter16

class Demo extends App {

  //列表不可变，列表具有递归结构
  //  val fruit = List("apples","oranges","pears")
  //  val nums = List(1,2,3,4)
  //  val diag3 = List(List(1,0,0),List(0,1,0),List(0,0,1))
  //  val empty = List()

  //此声明和上边的声明效果一样
  val fruit = "apples" :: "orange" :: "pears" :: Nil
  val nums = 1 :: 2 :: 3 :: 4 :: Nil
  val diag3 = (1::0::0::Nil) :: (0::1::0::Nil) :: (0::0::1::Nil)::Nil
  val empty = Nil








}
