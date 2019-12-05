package chapter3

object CollectionTest extends App {

  var jetSet = Set("时不我待", "岁不我与", "何能有我", "何能成我")

  jetSet += "如清风拂柳"
  println(jetSet.contains("时不我待"))


  val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")

  movieSet += "Shrek"

  println(movieSet)

  val treasureMap = scala.collection.mutable.Map[Int,String]()

  treasureMap += (1 -> "时不我待")
  treasureMap += (2 -> "岁不我与")
  treasureMap += (3 -> "何能有我")
  treasureMap += (4 -> "何能成我")

  println(treasureMap(2))


  //循环尽量保持无“副作用”


}
