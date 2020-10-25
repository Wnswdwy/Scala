package com.teacher.scala.day06.chapter07

import scala.collection.mutable

object Scala05_Collection_Set1 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Set

        // 可变set集合是使用包名区分
        val set = mutable.Set(1,2,3,4,3,4,5,6)

        // 增加数据
        //set.add(7) // 【1，2，3，4，5，6， 7】

        // 更新 集合本身
        //set.update(5, false) // 【1，2，3，4，5，6，7，8】

        // 删除元素
        //set.remove(1) // 【2，3，4，5，6，7，8】

        // 可变集合也有可能产生新 的集合
        set + 7
        set += 7

        println(set)


    }
}
