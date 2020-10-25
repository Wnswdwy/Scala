package com.teacher.scala.day04.chapter06

object Scala14_Object_Trait4 {

    def main(args: Array[String]): Unit = {

        // 一个类混入多个无关的特征，那么包含相同的方法时，会出现问题。

//        val user = new User()
//        user.run()
    }
    trait Runnable {
        def run(): Unit = {
            println("run....")
        }
    }
    trait Test {
        def run(): Unit = {
            println("test....")
        }
    }
//    class User extends Test with Runnable {
//
//    }
}