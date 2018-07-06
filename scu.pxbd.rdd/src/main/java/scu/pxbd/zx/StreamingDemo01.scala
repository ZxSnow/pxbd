package scu.pxbd.zx

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}


object StreamingDemo01 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("StreamingDemo01").setMaster("local[4]")
    val streamingContext = new StreamingContext(conf,Seconds(3))

    val inputStream = streamingContext.socketTextStream("192.168.139.101",8888)
    val countStream = inputStream.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)
    countStream.print()

    streamingContext.start()
    streamingContext.awaitTermination()

  }

}
