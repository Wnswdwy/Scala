package com.teacher.scala.day05.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Method {

    def main(args: Array[String]): Unit = {

        // 集合常用的方法
        val buffer = ArrayBuffer(1,2,3,4)

        println(buffer.length) // 4
        println(buffer.size) // 4
        println(buffer.isEmpty)
        println(buffer.contains(3))

        val iterator: Iterator[Int] = buffer.iterator
        while ( iterator.hasNext ) {
            println(iterator.next())
        }

        println(buffer.mkString(","))
        buffer.foreach(println)

    }
}
