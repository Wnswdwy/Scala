package com.nswdwy.scala.chapter07_day06.practice


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _4_Set {
    def main(args: Array[String]): Unit = {
        val ints: Set[Int] = Set(1, 3, 2, 2, 1, 3, 4, 6, 5, 7)
        val set: Set[Any] = Set(1, 3, 2, 2, 1, "aj", 5, 4, 6, 5, 7)
        val list: List[Int] = List(4, 8, 7, 9)
        val ints1 = ints + 8
        val ints2 = ints + "__jj"
        val ints3 = set + "__jj"
        val ints4 = set + list
        println(ints.size)
        println(ints)
        println(ints1)
        println(ints2)
        println(ints3)
        println(ints4)
        println(ints eq ints1)
        println(ints eq ints2)


    }
}
