package com.nswdwy.scala.chapter07_day06.practice



/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _3_Seq {
    def main(args: Array[String]): Unit = {
        // TODO
//        new Seq[String]()
        val ints: Seq[Int] = Seq(1, 2, 3, 4)
        println(ints.+:(0))
    }

}
