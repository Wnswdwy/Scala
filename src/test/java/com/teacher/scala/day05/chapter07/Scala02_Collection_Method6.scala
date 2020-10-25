package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer
import scala.math.Ordering

object Scala02_Collection_Method6 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
        val buffer = ArrayBuffer(1,4,2,3)
        val stringBuffer = ArrayBuffer("1", "2","11", "3")

        // TODO sortBy
        // 根据指定的规则对数据集进行数据排序，默认为升序
        //println(buffer.sortBy(num => num))
        println(stringBuffer.sortBy(s => s.toInt))
        println(stringBuffer.sortBy(s => s.toInt)(Ordering.Int.reverse))
    }
}
