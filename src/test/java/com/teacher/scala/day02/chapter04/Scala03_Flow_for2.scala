package com.teacher.scala.day02.chapter04

object Scala03_Flow_for2 {

    def main(args: Array[String]): Unit = {

        // 默认情况下，for循环表达式的返回结果为Unit类型对象()
        val result = for ( i <- 1 to 5 ) yield {
            i * 2
        }

        println(result)

        // yield关键字可以使用反引号进行引用声明
        Thread.`yield`()

        val `private` = "私有的"


    }

}
