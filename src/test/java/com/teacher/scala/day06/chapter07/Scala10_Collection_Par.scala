package com.teacher.scala.day06.chapter07


object Scala10_Collection_Par {

    def main(args: Array[String]): Unit = {
        val result1 = (0 to 100).map{x => Thread.currentThread.getName}
        val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}

        println(result1)
        println(result2)

    }
}
