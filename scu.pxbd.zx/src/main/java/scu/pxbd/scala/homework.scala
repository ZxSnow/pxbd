package scu.pxbd.scala


object homework {
  def main(args: Array[String]): Unit = {
    val list0 = List(1,7,9,8,0,3,5,4,6,2)
    println("创建一个list"+list0)

    val list0_1 = for(i<- list0) yield i*10
    println("将List中的数据都乘以10"+list0_1)

    val list0_2 = for(i<- list0 if(i%2==0))  yield i
    //val list0_2 = list0.filter(_%2==0)
    println("取出List中的偶数"+list0_2)

    val list0_3 = list0.sorted
    println("将List中的数据排序"+list0_3)

    val list0_4 = list0_3.reverse
    println("将List数据从大到小排列"+list0_4)

    val it = list0.grouped(4)
    println("将List中数据每四个分组"+it)

    val list0_5 = it.toList
    println("将Iterator转换成List"+list0_5)

    val list0_6 = list0_5.flatten
    println("将多个List转换成一个"+list0_6)

    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    val words = lines.flatMap(_.split(" "))
    println("拆分为单词"+words)

    def seqop(a:Int,b:List[Int]):Int ={
      println("seqop "+a+" \t"+b)
      println("!"+a+" "+b.sum)
      a+b.sum
    }
    def combop(a:Int,b:Int):Int = {
      println("combop "+a+" \t"+b)
      print("!"+a+b)
      a+b
    }

    val arr = List(List(1, 2, 3), List(3, 4, 5), List(2), List(0))
    val ayys = arr.flatten
    val result = arr.aggregate(0)(seqop,combop)
    println("聚合list"+ayys)
    println("LooK!"+result)

    val l1 = List(5,6,4,7)
    val l2 = List(1,2,3,4)

    val list1_2 = l1.union(l2).distinct//消除重复元素
    println("合并两个List"+list1_2)

    val list1_3 = l1.intersect(l2)
    println("求两个List的交集"+list1_3)

  }

}
