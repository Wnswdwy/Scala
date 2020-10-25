package com.teacher.scala.day03.chapter05

object Scala10_Function {

    def main(args: Array[String]): Unit = {
        // 函数, 编译后其实就是类中的方法，但是使用private，static， final修饰
        def fun(): Unit = {
            println("fun....")
        }
    }
    // 方法， 编译后其实就是类的方法，所以可以根据对象来使用
    def test(): Unit = {

    }
    def fun(): Unit = {

    }
}
