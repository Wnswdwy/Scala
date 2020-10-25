package com.nswdwy.scala.chapter07_day05.practice

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _1_Array_immutable {
    def main(args: Array[String]): Unit = {
        val ints: Array[Int] = new Array[Int](5)
        println(ints.+:(5).mkString(","))//5,0,0,0,0,0

        //右加
        println(ints.:+(6).mkString(","))  //0,0,0,0,0,6  //常用
        println((ints :+ 7).mkString(",")) //0,0,0,0,0,9
        //左加
        println(ints.+:(8).mkString(","))  //8,0,0,0,0,0  //常用
        println((9 +: ints).mkString(",")) //7,0,0,0,0,0


    }
}
