package com.teacher.scala.day04.chapter06

//import java.lang.{String=>S, _}

object Scala18_Object {

    def main(args: Array[String]): Unit = {

        val user : User = new User();
        val name : String = "zhangsan"
        val id : Integer = 10

        type U = User

        println(new U)
    }
    class User {

    }
}