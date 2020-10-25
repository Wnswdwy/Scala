package com.teacher.scala.day06.chapter07

object Scala06_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Map

        // Map集合描述了存储键值对对象，无序的，Key不能重复
        // 两个元素的组合就是键值对，也是元组
        //val kv = ("a", 1)

        val map1 = Map(
            ("a", 1), ("b", 2), ("c", 3),
            ("a", 4), ("e", 5), ("c", 6)
        )

        // Scala中 -> 方法用于创建关联关系，形成键值对
        val map2 = Map(
            "a" -> 1, "b" -> 2, "c" -> 3
        )

        println(map1)
        println(map2)

    }
}
