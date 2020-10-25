package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Method3 {

    def main(args: Array[String]): Unit = {

        // 集合常用的方法
        //val buffer = ArrayBuffer(1,2,3,4)
        //val buffer1 = ArrayBuffer(3,4,5,6)

        // 拉链,将两个数据集中相同位置的数据连接在一起
        //println(buffer.zip(buffer1))

        // 数据集中每三个数据的和
        val buffer = ArrayBuffer(1,5,7,4,2,9,3,8)
        // 1,5,7
        // 5,7,4
        // 7,4,2

        // 1,5,7
        // 5,7,4
        // 滑动
        val iterator: Iterator[ArrayBuffer[Int]] = buffer.sliding(3,3)
        while ( iterator.hasNext ) {
            val ints: ArrayBuffer[Int] = iterator.next()
            println(ints.sum)  //13
            /*
            13
            15
            11
             */

        }

    }
}
