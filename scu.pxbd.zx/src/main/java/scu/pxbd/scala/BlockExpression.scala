package scu.pxbd.scala

object BlockExpression {

  def main(args: Array[String]): Unit = {
    var blockExpression = {var a  = 1 ; a = a+5 ;  a + " hello "}

    println("the variable blockExpression equals " + blockExpression)
  }
}
