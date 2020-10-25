package com.teacher.scala.day06.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala15_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - WordCount

        val list = List(
            ("Hello Hive Hadoop Scala", 4),
            ("Hello Hive Hadoop", 3),
            ("Hello Hive", 2),
            ("Hello", 1)
        )
        // ("Hello Hive Hadoop", 3) => ("hello", 3), ("hive", 3), ("hadoop", 3)
        // ("Hello Hive", 2) => ("hello", 2), ("hive", 2)
        // ("Hello", 1)

        // ("Hello", 1,2,3,4)=>("hello", 10)
        val flatResult = list.flatMap(
            t => {
                val str = t._1
                val cnt = t._2
                // (Hello, Hive)
                str.split(" ").map(
                    word => {
                        ( word, cnt )
                    }
                )
            }
        )

        // List((Hello,4), (Hive,4), (Hadoop,4), (Scala,4), (Hello,3), (Hive,3), (Hadoop,3), (Hello,2), (Hive,2), (Hello,1))
        val groupMap: Map[String, List[(String, Int)]] = flatResult.groupBy(_._1)

        // ( hello, [ (hello,4),("hello",3) ] )
        // ( hello, 10)
        val result = groupMap.map(
            t => {
                val word = t._1
                // List((hello,4), (hello,3))
                val list = t._2
                // List(4,3,2,1)
                val cntList = list.map(_._2)
                (word, cntList.sum)
                //(word, cntList.reduce(_+_))
            }
        )


        println(result)




    }
}
