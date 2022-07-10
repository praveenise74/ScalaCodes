package LeetCode

object RomanToInteger extends App{
  def romanToInt(s: String): Int = {

    val rr = s.reverse.toList
    val len = s.length
    var i = 0
    var res = 0

    while(i < len) {
        if(i > 0 && isSubtract(rr(i-1), rr(i)))
          res -= symToVal(rr(i))
        else
          res += symToVal(rr(i))
      i+=1
    }
    res
  }

  def symToVal(c: Char): Int = {
    val symValMap: Map[Char, Int] = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

    symValMap(c)
  }

  def isSubtract(c1: Char, c2: Char): Boolean ={

      if (c2 == 'I' && (c1 == 'V' || c1 == 'X')) true
      else if (c2 == 'X' && (c1 == 'L' || c1 == 'C')) true
      else if (c2 == 'C' && (c1 == 'D' || c1 == 'M')) true
      else false
    }

  println(romanToInt("MCMXCIV"))
}
