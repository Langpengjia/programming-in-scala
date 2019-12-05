package object chapter6 {

  /**
    * 开启Int隐式转换为Rational
    *
    * @param x
    * @return
    */
  implicit def int2Rational(x: Int) = new Rational(x)

}
