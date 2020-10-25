package com.teacher.scala.day04.chapter06

object Scala13_Object_Trait2 {

    def main(args: Array[String]): Unit = {

        // 动态混入功能，实现功能扩展
        val user = new User() with UserExt
        user.insertUser()
        user.updateUser()
    }
//    class Parent {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
    trait UserExt {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }

    }
}