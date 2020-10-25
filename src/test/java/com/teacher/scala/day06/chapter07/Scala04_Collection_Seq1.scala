package com.teacher.scala.day06.chapter07

import scala.collection.mutable.ListBuffer

object Scala04_Collection_Seq1 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Seq(List)
        val list = ListBuffer(1,2,3,4)

        //list.insert()
        list.append(5) // 【1，2，3，4，5】
        //list.appendAll()
        list.update(3, 6) // 【1，2，3，6，5】
        list.remove(2)   //  【1，2，6，5】

        println(list)
        //list.mkString()
        //list.foreach()
        //list.iterator
        //list.group
    }
}
