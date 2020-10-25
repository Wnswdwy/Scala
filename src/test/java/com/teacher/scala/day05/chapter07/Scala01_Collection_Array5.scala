package com.teacher.scala.day05.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala01_Collection_Array5 {

    def main(args: Array[String]): Unit = {

        // 可变数组和不可变数组的转换

        // 不可变 => 可变
        val array = Array(1,2,3,4)
        val buffer: mutable.Buffer[Int] = array.toBuffer

        // 可变 => 不可变
        val buff = ArrayBuffer(1,2,3,4)
        val array1: Array[Int] = buff.toArray

    }
}
