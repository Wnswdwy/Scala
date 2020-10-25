package com.nswdwy.scala.chapter07_day06.review

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _9_Function_Reduce {
    def main(args: Array[String]): Unit = {
        // TODO Function
        val list : List[Int] = List(1, 2, 3, 4, 5)
        val k1: Int = list.reduce(_ + _)
        val k2: Option[Int] = list.reduceOption(_ + _)
        println("k1---->"+k1)
        println("k2--->"+ k2)
    }

}
