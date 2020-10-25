package com.teacher.scala.day06.chapter07

object Scala04_Collection_Seq {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Seq(List)
        // scala默认提供的集合都是不可变的
        //val seq = Seq(1,2,3,4)
        // 创建集合
        val list = List( 1,2,3,4 )

        // 不可变集合对数据的操作会产生新的集合
        //val list1: List[Int] = list :+ 5
        //val list2: List[Int] = list.+:(5)
        //val list2: List[Int] = 5 +: list

        //println(list eq list1)
        //println(list1)
        //println(list2)

        // 空集合,Scala中可以采用特殊对象
        Nil // List()
        val list3: List[Int] = 1::2::3::Nil
        val list4: List[Int] = 4::5::list3:::Nil
        val list5 = 4::5::list3::Nil

        // 3::Nil => List(3)
        // 2::List(3) => List(2,3)
        // 1::List(2,3) => List(1,2,3)

        println(list3)
        println(list4)
        println(list5)

    }
}
