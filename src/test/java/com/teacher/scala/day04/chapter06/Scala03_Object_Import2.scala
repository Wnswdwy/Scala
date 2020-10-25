package com.teacher.scala.day04.chapter06

import java.util.{HashMap => JavaHashMap}

object Scala03_Object_Import2 {

    def main(args: Array[String]): Unit = {

        val user = new User()
        // Scala中可以导入对象的所有内容
        // Scala导入对象的变量必须使用val声明
        import user._
        println(username)

    }
    class User {
        val username : String = "zhangsan"
    }
}
