package com.teacher.scala.day06.chapter07

object Scala05_Collection_Set {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Set

        // Set描述了无序，数据不可重复的集合
        val set = Set(1,2,3,4,3,4,5,6)

        val newSet: Set[Int] = set + 7

        val newSet1: Set[Int] = newSet - 5

        //println(set eq newSet)
        println(newSet1)

    }
}
