package scu.pxbd.zx
import org.apache.spark.{SparkConf, SparkContext}
object CheckPoint {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("CheckPoint")
    val sparkContext = new SparkContext(sparkConf)
    sparkContext.setCheckpointDir("hdfs://hdp-node-01:9000/checkpoint")

    val rdd = sparkContext.parallelize(List("scala","hadoop","math" ,"scala" , "hadoop" , "math","scala" , "hadoop" , "math"))

    val rdd_reduce = rdd.map((_,1)).reduceByKey(_+_)

    rdd_reduce.checkpoint()
    rdd_reduce.collect()
    sparkContext.stop()
  }

}
