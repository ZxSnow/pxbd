package scu.pxbd.scala

class Person {
  var name:String = _
  var gender:String  = _

     def this(name_1:String,gender_1:String){
       this()
       this.name = name_1
       this.gender = gender_1
       println("this id second constructor")
     }

  println("this default constructor")

  private var weight:Int = _
  private[this] var password:String = "123456"
  def requestPassword(flag:Boolean) :String = {
    var passd :String = if(flag) password else "unknown"
    passd
  }

}
object Person extends App{
  println("app")

  def apply(name:String): Person = new Person()

  def apply(name:String,gender:String):Person = {
    new Person(name,gender)
  }

}
