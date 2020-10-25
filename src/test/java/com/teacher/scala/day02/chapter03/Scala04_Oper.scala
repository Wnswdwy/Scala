package com.teacher.scala.day02.chapter03

object Scala04_Oper {

    def main(args: Array[String]): Unit = {

        // Scala是完全面向对象的，所以数字也是对象
        // 万物皆对象
        // 所以数字会有很多的方法
        //val b = 10.toByte
        // scala中的运算符其实就是对象的方法
        //10 + 10
        val i = 10.+(10)
        // 马丁：希望代码开发变得简单，所以能推断出来的语法操作，就可以省略
        //val j = 10 +(10)
        val j = 10 + 10
        println(i)

        //j toString
        // 标识符命名规则
        10 % 10

    }
    def %(num:Int): Unit = {

    }
}
