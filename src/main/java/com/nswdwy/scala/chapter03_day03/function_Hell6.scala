package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 20:48
 */
object function_Hell6 {
  def main(args: Array[String]): Unit = {
    //TODO 控制抽象

    def ff(op: => Unit) = {
      op
    }

    ff{
      val i = 10
      val j = 12
      println(i + j)
    }
  }
}
