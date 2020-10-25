package com.teacher.scala.day01.chapter01

object Scala02_Method {

    def main(args: Array[String]): Unit = {
        // 方法调用
        test()

        // Scala语言是一个完全面向对象的语言，没有静态语法，没有static关键字
        // 可以采用object关键字声明对象访问方法，模仿静态语法
        Scala02_Method.test()
    }
    // 声明方法
    def test():Unit = {
        println("test...")
    }
}
