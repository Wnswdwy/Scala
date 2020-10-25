package com.teacher.scala.day01.chapter02

import scala.io.{BufferedSource, Source}

object Scala08_DataType {

    def main(args: Array[String]): Unit = {

        // Scala是完全面向对象的语言，所以没有基本类型。
        // 将java中基本类型定义了对应的普通类型
//         java => byte, short int long float double char boolean
//         scala => Byte Short Int Long Float Double Char Boolean
        val age : Int = 20

        println(age)
    }
}
