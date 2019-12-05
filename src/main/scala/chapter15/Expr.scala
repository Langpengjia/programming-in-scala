package chapter15

abstract class Expr {

  case class Var(name: String) extends Expr

  case class Number(num: Double) extends Expr

  case class UnOp(operate: String, arg: Expr) extends Expr

  case class BinOp(operate: String, left: Expr, right: Expr)

//  def simplifyTop(expr: Expr): Expr = expr match {
//    case UnOp("-", UnOp("-", e)) => e
//    case _ => expr
//
//  }

}

//包含了递增优先级的组中的操作符
class ExprFormatter{
  private val opGroups =
    Array(
      Set("|","||"),
      Set("&","&&"),
      Set("^"),
      Set("==","!="),
      Set("<","<=",">","<="),
      Set("+","-"),
      Set("*","%")
    )
  //操作符到优先级的映射
//  private val precedence = {
//    val assocs =
//      for{
//        i<- 0 until opGroups.length
//        op <- opGroups(i)
//      } yield op => i
//    Map() ++ assocs
//  }
  private val unaryPrecedence = opGroups.length
  private val fractionPrecedence = -1

//  private def format(e:Expr,enclPrec:Int) =

}


