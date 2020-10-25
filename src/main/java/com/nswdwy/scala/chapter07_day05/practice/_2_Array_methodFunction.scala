package com.nswdwy.scala.chapter07_day05.practice

import scala.collection.mutable.ArrayBuffer


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _2_Array_methodFunction {
    def main(args: Array[String]): Unit = {
        val strings: ArrayBuffer[String] = ArrayBuffer("Hive", "Flume", "Kafka", "Spark","Hadoop","Scala")
        println(strings.map(_.substring(0,1)))


        val buffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
        //groupby后的数据为map==>K-分组的Key；V-相同的K的数据集

        println(buffer.groupBy(_ % 2))
        println(strings.groupBy(_.substring(0, 1)))


    }

}
