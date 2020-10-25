package com.nswdwy.scala.chapter07_day06.review

import scala.collection.mutable.ListBuffer


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _3_Seq1 {
    def main(args: Array[String]): Unit = {
        val ints: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
        val ints1 = List(3, 4, 5, 6)
        //Scala中的空集合可以采用特殊
        val list = 1 :: 2 :: 3:: 4::Nil
        val list2 = 2::"3"::Nil
        val list3 = 2::ints1::Nil
        val list4 = 9::ints1:::2::Nil
        println(list)
        println(list2)
        println(list3)
        println(list4)
    }
}
