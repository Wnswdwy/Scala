package com.nswdwy.scala.chapter07_day05.practice

import scala.collection.mutable.ArrayBuffer


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _2_Array_methodFunction_wordcount {
    def main(args: Array[String]): Unit = {
        val strings: ArrayBuffer[String] = ArrayBuffer("Hello Scala Hive", "Hello Scala", "Scala")
        val strings1: ArrayBuffer[String] = strings.flatMap(_.split(" "))
        println(strings1)
        println("-----------------------------")
        val stringToStrings: Map[String, ArrayBuffer[String]] = strings1.groupBy(word => word)
        println(stringToStrings)
        println("---------------------------")
        println(stringToStrings.map(t => {
            val word = t._1
            val array = t._2
              (word,array.length)

        }))
        println("-------------------------------")
        println(stringToStrings.map(t => (t._1,t._2.length)))


    }

}
