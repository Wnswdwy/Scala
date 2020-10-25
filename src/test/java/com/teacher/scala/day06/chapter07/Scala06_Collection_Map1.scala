package com.teacher.scala.day06.chapter07

import scala.collection.mutable

object Scala06_Collection_Map1 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Map
        val map = mutable.Map("a"->1, "b"->2,"c"->3)

        map.put("d", 4)
        map.put("a", 5)

        map.update("c", 6)

        map.remove("b")

        println(map)

    }
}
