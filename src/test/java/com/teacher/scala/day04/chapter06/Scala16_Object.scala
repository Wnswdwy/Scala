package com.teacher.scala.day04.chapter06

object Scala16_Object {

    def main(args: Array[String]): Unit = {

        println(Color.RED.id)

    }
    object Color extends Enumeration {
        val RED = Value(1, "red")
        val YELLOW = Value(2, "yellow")
        val BLUE = Value(3, "blue")
    }
}