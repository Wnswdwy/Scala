package com.nswdwy.scala.chapter07_day07.practice

/**
 * @author yycstart
 * @create 2020-10-24 10:48
 */
object _1_Match {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(1, 2, 3, 4, 5, "test")
    val result = list.collect{
      case d:Int => d+1
    }
    println(result)

  }
}
