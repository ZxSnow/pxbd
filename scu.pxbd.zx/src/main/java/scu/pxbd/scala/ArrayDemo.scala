package scu.pxbd.scala

import scala.collection.mutable.ArrayBuffer


object ArrayDemo {
  def main(args: Array[String]): Unit = {
    arrayDef()
    arrayBufferDemo()
    arrayMethod()
  }
  def arrayDef(): Unit ={

    var arr = new Array[Int](10)
    var arr_1 = arr.+:(2)
    var t = arr_1.++:(Array(1,2,3,4))
    t(4) = 10000
    for(a <- t ){
      print(a+"\t")
    }
    println("END")
    var arr_2 = Array(1,2,3,45,6) // object Array 是class Array的半生对象， 在内存当中只有一个实例
    //arr_2.+:=(65)
    arr_2(2) = 1000
    for(a<-arr_2){
      print(a+"\t")
    }
    println("END")
  }

  def arrayBufferDemo(): Unit ={
    var arrayBuffer = new ArrayBuffer[Int](10)
    arrayBuffer.++=(Array(1,3,4,6,7)) // ++ that , 这是可变的数组

    var fuc = (a:Int) => a * 10
    var arrayBuffer_01 = arrayBuffer.map(fuc)
    println(arrayBuffer_01)
    println(arrayBuffer)
    //var filter_fuc = (a:Int) => if(a % 2 !=0) a //输出：ArrayBuffer(1, 3, (), (), 7)
    var arrayBuffer_02 = arrayBuffer.filter(_ % 2!=0) // _ 表示的是占位符，传入的参数，表示的是集合里面的每一个元素
    //var arrayBuffer_02 = arrayBuffer.map(filter_fuc)
    println(arrayBuffer_02)
    println(arrayBuffer)
    println("END")
  }

  def arrayMethod(): Unit ={
    var arr  =Array[Int](2,1,6,22,7,3,9,10)

    var arr_sort01 = arr.sortBy(_ * 5)

    println(arr_sort01.toList , arr.toList)
    var arr_sort02 = arr.sorted.reverse
    println(arr_sort02.toList)
    var arr_sort03 = arr.sortWith(_ < _)
    println(arr_sort03.toList)
    println("END")
  }
}

