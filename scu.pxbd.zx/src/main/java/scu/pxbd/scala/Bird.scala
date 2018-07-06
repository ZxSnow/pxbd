package scu.pxbd.scala

class Bird extends LowAnimal with Fly with Terrestrial {
    println("Bird---------")

  override def run(): Unit = {}

}
object Bird extends App{
  println(new Bird())
}
