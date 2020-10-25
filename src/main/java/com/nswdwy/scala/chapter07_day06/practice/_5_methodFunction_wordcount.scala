package com.nswdwy.scala.chapter07_day06.practice

import scala.collection.immutable


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _5_methodFunction_wordcount {
    def main(args: Array[String]): Unit = {
        val tuples: List[(String, Int)] = List(
            ("Hello Scala Hive Spark", 4),
            ("Hello Scala Hive", 3),
            ("Hello Scala", 2),
            ("Hello", 1)
        )
        val tuples1: List[(String, Int)] = tuples.flatMap(
            t => {
                val keys = t._1
                val value: Int = t._2
                val key = keys.split(" ")
                key.map(
                    word => (word, value)
                )
            }
        )
//            tuples1.foreach(println)
        //List((Hello,4), (Scala,4), (Hive,4), (Spark,4), (Hello,3), (Scala,3), (Hive,3), (Hello,2), (Scala,2), (Hello,1))
        println(tuples1)
        println("-----------------------------")
        val newMap: Map[String, List[(String, Int)]] = tuples1.groupBy(_._1)
        //Map(Hello -> List((Hello,4), (Hello,3), (Hello,2), (Hello,1)), Spark -> List((Spark,4)), Scala -> List((Scala,4), (Scala,3), (Scala,2)), Hive -> List((Hive,4), (Hive,3)))
        println(newMap)
        println("------------------------------")
        val result: Map[String, Int] = newMap.map(
            t => {
//                val key: String = t._1
//                val sum: Int = t._2.map(_._2).sum //(4,3,2,1),(4,3,2),(4,3),(4)
//                (key, sum)
                (t._1,t._2.map(_._2).sum)
            }
        )
        //Map(Hello -> 10, Spark -> 4, Scala -> 9, Hive -> 7)
        println(result)
    }

}
