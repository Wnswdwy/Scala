package com.nswdwy.scala.chapter07_day06.practice

import scala.collection.mutable.ArrayBuffer


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _2_Array_methodFunction {
    def main(args: Array[String]): Unit = {
        val strings: ArrayBuffer[String] = ArrayBuffer("Hello Scala Hive", "Hello Spark", "Flunk")
        println(strings.flatMap(strings => strings))
        val flatten: ArrayBuffer[Char] = strings.flatten
        println(flatten)
    }

}
