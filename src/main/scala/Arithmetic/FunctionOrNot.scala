package Arithmetic
import scala.io.StdIn.{readInt, readLine}

object FunctionOrNot extends App{

  val T: Int = readInt()
  var N: Int = _
  var x_y: String = _
  var x1: List[Int] = List.empty[Int]

  for(i <- 1 to T){
    N = readInt()
    x1 = List.empty[Int]
    for( j <- 1 to N){
      x_y = readLine()
      x1 = x1 :+ x_y.split(" ")(0).toInt
    }
    if (x1.distinct.size == x1.size) println("YES") else println("NO")
  }
}
