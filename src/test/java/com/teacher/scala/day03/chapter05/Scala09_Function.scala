package com.teacher.scala.day03.chapter05

object Scala09_Function {

    def main(args: Array[String]): Unit = {
        def fun9(): String = {
            println("function...")
            "zhangsan"  // 10000 User Object
        }
        val a = fun9()
        println("----------") // 10min
       // val a = fun9()
        println(a)

        // 顺序执行
//         function...
//         ---------
//         zhangsan

    }
}
