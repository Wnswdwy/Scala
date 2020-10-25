package com.teacher.scala.day07.cahpter10

object Scala02_Transform {

    def main(args: Array[String]): Unit = {

        implicit def transform( user : User ): UserExt = {
            new UserExt()
        }

        // 隐式转换可以扩展功能
        // ******************************
        val user = new User()
        user.insertUser()
        // *****************************
        user.updateUser()

//        val b : Byte = 10
//        val i : Int = b
    }
    class UserExt {
        def updateUser(): Unit = {
            println("update user....")
        }
    }
    class User  {
        def insertUser(): Unit = {
            println("insert user....")
        }
    }
}
