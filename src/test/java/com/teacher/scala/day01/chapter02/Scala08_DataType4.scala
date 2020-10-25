package com.teacher.scala.day01.chapter02

object Scala08_DataType4 {

    def main(args: Array[String]): Unit = {

        // 数字默认为Int类型，如果想限定类型，那么必须明确变量的类型，不能省略
        val b : Byte = 10
        val i : Int = b

        // 在scala语法中没有强制类型转换，可以通过方法进行转换
        // 马丁
        // Scala语言中没有精度的概念
        // Scala语言中任意值类型之间其实不能互相转换。类之间没有关系。
        // 之所以可以转换，那么在编写编译器时自动帮助我们进行了转换。（隐式转换）
        val bb : Byte = i.toByte
    }

}
