package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Method1 {

    def main(args: Array[String]): Unit = {

        // 集合常用的方法
        val buffer = ArrayBuffer(1,2,3,4)

        // 反转
        println(buffer.reverse) //ArrayBuffer(4, 3, 2, 1)
        // 获取前三条
        println(buffer.take(3)) //ArrayBuffer(1, 2, 3)

        // 获取后三条
        //println(buffer.reverse.take(3).reverse)
        println(buffer.takeRight(3))  //ArrayBuffer(2, 3, 4)
        // 删除数据
        println(buffer.drop(1))  //ArrayBuffer(2, 3, 4)
        println(buffer.dropRight(1)) //ArrayBuffer(1, 2, 3)

        // 头
        println(buffer.head) // 1
        // 尾
        println(buffer.tail) // 【2，3，4】
        // 最后一个
        println(buffer.last) // 4
        // 初始
        println(buffer.init) // 【1，2，3】

        // Array() + 1 => Array(1) + 2 =>
    }
}
