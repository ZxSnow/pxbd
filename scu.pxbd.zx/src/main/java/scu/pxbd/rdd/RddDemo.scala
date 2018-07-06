package scu.pxbd.rdd

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object RddDemo {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("map")
    val sc = new SparkContext(conf)
    val rdd  = sc.textFile("hdfs://hdp-node-01:7077/spark")
    val rdd1 = rdd.flatMap(_.split(" ")).map((_, 1 )).reduceByKey(_ + _).sortBy(_._2,false)
    rdd1.collect
    rdd1.saveAsTextFile("hdfs://hdp-node-01:7077/spark01")
  }

}
