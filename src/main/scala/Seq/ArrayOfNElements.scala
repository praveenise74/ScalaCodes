package Seq

import scala.io.StdIn.readInt

object ArrayOfNElements extends App{

  def f(num:Int) : List[Int] = {
    val list = {
      var l: List[Int] = List.empty[Int]
      for(i <- 0 until num)
         l = l:+i

      l
    }

    print(list + "\n")
    list
  }

  def f1(num:Int) : List[Int] = {
    val list = (0 until num).toList //(0 to num).toList /*USe "to" for including last numer also*/

    print(list + "\n")
    list
  }

  val readNum = readInt

  f(readNum)
  f1(readNum)
}
