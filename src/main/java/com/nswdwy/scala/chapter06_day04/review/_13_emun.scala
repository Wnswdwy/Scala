package com.nswdwy.scala.chapter06_day04.review

/**
 * @author yycstart
 * @create 2020-10-22 0:07
 */
object _13_emun {
  def main(args: Array[String]): Unit = {

    println(Color.RED.id)

  }
  object Color extends Enumeration {
    val RED = Value(1, "red")
    val YELLOW = Value(2, "yellow")
    val BLUE = Value(3, "blue")
  }


}
