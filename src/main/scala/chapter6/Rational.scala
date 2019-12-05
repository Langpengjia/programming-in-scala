package chapter6

/**
  * 有理数类
  */
class Rational(n: Int, d: Int) {
  require(d != 0)
  println("Create " + n + "/" + d)

  val number = n
  val denom = d
  val g = gcd(number, denom)

  def this(n: Int) = this(n, 1)

  override def toString: String = number + "/" + denom

  val add = (that: Rational) => new Rational(number * that.denom + denom * that.number, denom * that.denom)

  val lessthan = (that: Rational) => this.number * that.denom < that.number * this.denom

  val max = (x: Rational) => if (lessthan(x)) x else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def + = (x: Rational) => add(x)

  def < = (x: Rational) => lessthan(x)

  def - = (i: Int) => new Rational(number - i * denom, denom)

  def / = (x: Rational) => new Rational(number * x.denom, x.number * denom)


}
