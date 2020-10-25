package com.teacher.scala.day07.cahpter10

object Scala06_Transform {

    def main(args: Array[String]): Unit = {

        // 伴生对象有apply方法，是编译器默认识别的，所以apply可以不用写
        // User()
        // 伴生类对象也有apply方法，是编译器默认识别的，所以apply可以不用写

        // scala中没有字符串，用的就是java中String
        val s : String = "abcdefg"
        //val c: Char = s.apply(0)
        val c: Char = s(0)
        println(c)
    }
}
