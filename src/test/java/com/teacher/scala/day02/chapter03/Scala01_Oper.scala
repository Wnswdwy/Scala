package com.teacher.scala.day02.chapter03

object Scala01_Oper {

    def main(args: Array[String]): Unit = {

        val s1 : String = new String("abc")
        val s2 : String = "abc"
        val s3 : String = new String("abc")

        // Scala语法基于java的，但是不尽相同
        //println( s1 == s2 ) // scala中的双等号会进行非空判断后，调用equals方法
        //println( s1 == s3 ) // true

//        println( s1.equals(s2) )
//        println( s1.equals(s3) )

        // scala中的eq方法在编译时会转换为java中的双等号语法。
        // 马丁：编译器
        println(s1.eq(s2))

    }
}
