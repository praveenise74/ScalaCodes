package Seq

import scala.io.StdIn.{readInt, readLine}
import scala.math.abs

/**
The area of polygon

|((x1y2 − y1x2) +	(x2y3 −	y2x3) .....	+	(xny1 −	yn x1))/2|

Where xn is the x coordinate of vertex n,
yn is the y coordinate of the nth vertex etc.
 */


object ComputeTheAreaOfaPolygon extends App{

  val coordCount = readInt

  var c = readLine.split(" ")
  var c1x: Double = c(0).toDouble
  var c1y: Double = c(1).toDouble

  val initialX = c1x
  val initialY = c1y

  c = readLine.split(" ")
  var c2x: Double= c(0).toDouble
  var c2y: Double = c(1).toDouble

  var combinedCoordinates: Double = combine2Coordinates(c1x, c1y, c2x, c2y)

  def combine2Coordinates(c1x: Double, c1y: Double, c2x: Double, c2y: Double) = {
    (c1x*c2y) - (c1y*c2x)
  }

  for(i <- 1 to coordCount-2){
    c1x = c2x
    c1y = c2y
    c = readLine.split(" ")
    c2x = c(0).toDouble
    c2y = c(1).toDouble

    combinedCoordinates += combine2Coordinates(c1x, c1y, c2x, c2y)

  }

  combinedCoordinates += combine2Coordinates(c2x, c2y, initialX, initialY)
  val areaOfPolygon = abs(combinedCoordinates)/2
  printf("%.7f",areaOfPolygon)
}
