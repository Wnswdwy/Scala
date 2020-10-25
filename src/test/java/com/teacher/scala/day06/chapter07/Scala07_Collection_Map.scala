package com.teacher.scala.day06.chapter07

import scala.collection.mutable

object Scala07_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Map
        val map = mutable.Map("a"->1, "b"->2,"c"->3)

        // 空指针异常
        // option : 选项
        // Some : 有值， None : 无值
        val maybeInt: Option[Int] = map.get("a") // Some(1)
        val maybeInt1: Option[Int] = map.get("d") // None
        // map集合允许放置空键空值
        // Option类型专门用于解决空指针异常所产生的类型
        if ( !maybeInt.isEmpty ) {
            println(maybeInt.get)
        }
        // NoSuchElementException
        // 获取数据，但是如果获取不到，设定一个默认值
        //println(maybeInt1.get)
        println(maybeInt1.getOrElse(0))

        //map.get("d").getOrElse(0)
        val i: Int = map.getOrElse("d", 0)
        println(i)
    }
}
