package com.teacher.scala.day06.chapter07

object Scala16_Req1 {

    def main(args: Array[String]): Unit = {

        val list = List(1,2,1,2)
        val list1 = List("Hello", "Hive")

        def groupFunction(num:Int) :Int = {
            num
        }

        // 在匿名函数使用时，如果传递的值直接返回，那么不能采用下划线代替，因为有歧义
        val group: Map[Int, List[Int]] = list.groupBy(num=>num)
        //list1.groupBy(_.substring(0,1))

        println(group)


    }
}
