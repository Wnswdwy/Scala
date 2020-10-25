package com.teacher.scala.day07.cahpter10

object Scala04_Transform {

    def main(args: Array[String]): Unit = {

        // 隐式转换其实转换的是类型
//        implicit def transform( user:User ): UserExt = {
//            new UserExt()
//        }

        val user = new User()
        user.insertUser()
        user.updateUser()
    }
    // 隐式类
    implicit class UserExt(user:User) {
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
