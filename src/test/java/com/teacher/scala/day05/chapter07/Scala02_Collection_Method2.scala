package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Method2 {

    def main(args: Array[String]): Unit = {

        // 集合常用的方法
        val buffer = ArrayBuffer(1,2,3,4)
        val buffer1 = ArrayBuffer(3,4,5,6)

        // 简单计算
        // 和
        println(buffer.sum)
        println(buffer.max)
        println(buffer.min)
        // 积
        println(buffer.product)

        // 交集
        println(buffer.intersect(buffer1)) // 【3，4】
        // 并集
        println(buffer.union(buffer1)) // 【1，2，3，4，3，4，5，6】
        // 差集
        println(buffer.diff(buffer1)) // 【1，2】

        // 去重
        println(buffer.union(buffer1).distinct)
    }
}
