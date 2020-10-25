package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell8 {

    def main(args: Array[String]): Unit = {

        val s = "zhangsan"
        def test(): Unit = {
            println(s)
        }

        test()

        // 所有函数赋值给对象都有闭包
        // 所有的匿名函数都有闭包
        //val a = test _



    }
}
