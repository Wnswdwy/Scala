package com.teacher.scala.day06.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala14_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - WordCount
        val lines = ArrayBuffer(
            "Hello Hive Hadoop Scala Hello Hive Hadoop Scala Hello Hive Hadoop Scala Hello Hive Hadoop Scala",
            "Hello Hive Hadoop Hello Hive Hadoop Hello Hive Hadoop",
            "Hello Hive Hello Hive",
            "Hello"
        )

        val list = List(
            ("Hello Hive Hadoop Scala", 4),
            ("Hello Hive Hadoop", 3),
            ("Hello Hive", 2),
            ("Hello", 1)
        )
        // Hello Hive Hadoop Scala Hello Hive Hadoop Scala Hello Hive Hadoop Scala Hello Hive Hadoop Scala
        // Hello Hive Hadoop Hello Hive Hadoop Hello Hive Hadoop
        // Hello Hive Hello Hive

        // Tuple => String
        val newLines = list.map(
            t => {
                // abc * 2 = abcabc
                (t._1 + " ") * t._2
            }
        )
        newLines.foreach(println)


    }
}
