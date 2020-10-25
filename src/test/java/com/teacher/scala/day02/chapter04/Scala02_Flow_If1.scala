package com.teacher.scala.day02.chapter04

object Scala02_Flow_If1 {

    def main(args: Array[String]): Unit = {


        // 表达式是有返回值
        val age = 40
        val result = if ( age == 20 ) {
            println("年龄等于20") // Unit
            null
        }

        // 表达式的返回值结果为表达式满足条件的最后一行逻辑代码的执行结果
        // Unit类型的对象只有一个，就是()
        // 返回结果的类型？
        println(result) // Any

    }

}
