package Seq

import scala.io.StdIn.{readInt, readLine}

object FilterElements extends App{

  val testCount: Int = readInt
  var N_K: Array[String]= _
  var N: Int = _
  var K: Int = _
  var A: Array[Int] = _

  for(i <- 1 to testCount){
    A = Array.empty[Int]
    N_K = readLine.split(" ")
    N = N_K(0).toInt
    K = N_K(1).toInt
    A = readLine.split(" ").map(_.toInt)

    

  }

}
