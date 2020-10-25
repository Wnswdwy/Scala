package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer
import scala.math.Ordering

object Scala03_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - WordCount
        val lines = ArrayBuffer(
            "Hello Scala Hive",
            "Hello Scala",
            "Scala"
        )

        // 1. 将数据拆分成一个一个的单词（扁平化）
        //    line => words
        val words = lines.flatMap(
            line => {
                line.split(" ")
            }
        )

        // 2. 将相同的单词放置在一个组中
        //    word => Array(word, word, word)
        // k => word
        // v => array
        // (word, array) => A
        // (word, count) => B
        val groupMap: Map[String, ArrayBuffer[String]] = words.groupBy(word=>word)

        // 3. 将分组后的数据进行统计
        //   Array(word, word, word) => 3
        val wordToCount: Map[String, Int] = groupMap.map(
            t => {
                val word = t._1
                val array = t._2

                (word, array.length)
            }
        )

        // 4. 将统计结果打印在控制台上
        println(wordToCount)

    }
}
