package com.teacher.scala.day03.chapter05

import scala.util.control.Breaks

object Scala06_Function {

    def main(args: Array[String]): Unit = {

        // TODO 控制抽象
        // 可以将函数作为一个对象传递给另外一个函数。
        // 但是有时候只希望传递一段逻辑（代码）,而不是函数的整体
        // 也就意味着将函数的一部分来使用，而不是整体，就和抽象一样。

        // 控制抽象的声明
        def fun(op:  => Unit) = {
            op  // 执行参数逻辑
        }

        // 调用
        // 如果函数的参数是多行，那么小括号可以采用大括号代替
        fun{
            val i = 10
            val j = 20
            println(i + j)
        }

        // 使用控制抽象，可以将一段代码逻辑作为参数传递个其他操作
        // 这样，逻辑就不是固定不变的。可以动态发生变化，一般用于实现自定义语法
        Breaks.breakable{
            for ( i <- 1 to 10 ) {
                if ( i % 2 == 0 ) {
                    Breaks.break()
                }
            }
        }



    }
    def logic(f:()=>Unit): Unit = {
        step1()
        f()
        step3()
    }
    def step1(): Unit = {

    }
    def mysql(): Unit = {

    }
    def hbase(): Unit = {

    }
    def step3(): Unit = {

    }
}
