package com.teacher.scala.day05.chapter07

import scala.collection.immutable

object Scala01_Collection_Array1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组

        val array: Array[Int] = new Array[Int](5)

        // 集合中的update方法等同于集合后面小括号
        //array(2) = "wangwu"
        //array.update(2, "wangwu")

        // scala中如果一个运算符使用冒号结尾，那么运算规则从后往前，从右向左
        // 对Array的操作，增加元素，之间的数组并不会发生改变，会产生新的数组
        val newArray: Array[Int] = array.+:(5)
        val newArray1: Array[Int] = 5 +: array
        val newArray2: Array[Int] = array :+ 6


        println(array eq newArray)
        println(newArray(2))
        println(array.mkString(","))
        println(newArray.mkString(","))
        println(newArray1.mkString(","))
        println(newArray2.mkString(","))



    }
}
