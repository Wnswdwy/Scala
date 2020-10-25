package com.teacher.scala.day06.chapter07

object Scala13_Collection_Method9 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 计算方法

        // reduce方法主要用于集合内部数据的聚合
        // 但是在某些情况下，可以将集合数据和集合之外的数据进行聚合
        // 这种操作称之为折叠

        // fold方法存在函数的柯里化，存在两个参数列表
        // 第一个参数列表表示集合之外的数据，称之为计算初始值 zero
        // 第二个参数列表表示数据两两计算的规则
        val list = List(1,2,3,4)
        //val i: Int = list.fold(0)(_-_)
        //list.foldLeft(0)(_+_)
        // reversed.foldLeft(z)((x, y) => op(y, x))
        // 0【4，3，2，1】 => (1 - (2 -(3 -(4 - 5))))
        val ii = list.foldRight(5)(_-_)

        // 将执行过程中的每一步操作保留结果
        val ints: List[Int] = list.scanRight(5)(_-_)
        println(ints)

        // TODO 今天晚上的练习 ： 两个Map的合并
        //        val map1 = Map("a"->1,"b"->2)
        //        val map2 = Map("a"->3,"c"->4)
        //        => Map("a"->4, "b"->2, "c"->4)
        //        xxxx.foldLeft(yyyy)(zzzz)
    }
}
