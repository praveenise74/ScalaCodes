package Seq

import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object ComputeThePerimeterOfaPolygon extends App{

  val coordCount = readInt

  var c = readLine.split(" ")
  var c1x: Double = c(0).toDouble
  var c1y: Double = c(1).toDouble

  val initialX = c1x
  val initialY = c1y

  c = readLine.split(" ")
  var c2x: Double= c(0).toDouble
  var c2y: Double = c(1).toDouble

  var perimeter: Double = distanceBetweenTwoPoints(c1x, c1y, c2x, c2y)

  def distanceBetweenTwoPoints(c1x: Double, c1y: Double, c2x: Double, c2y: Double) = {
    scala.math.sqrt(scala.math.pow(c2x - c1x, 2) + scala.math.pow(c2y - c1y, 2))
  }

  for(i <- 1 to coordCount-2){
    c1x = c2x
    c1y = c2y
    c = readLine.split(" ")
    c2x = c(0).toDouble
    c2y = c(1).toDouble

    perimeter += distanceBetweenTwoPoints(c1x, c1y, c2x, c2y)

  }

  perimeter += distanceBetweenTwoPoints(c2x, c2y, initialX, initialY)

  printf("%.7f",perimeter)
}
