package com.teacher.scala.day07.cahpter08

object Scala08_Match {

    def main(args: Array[String]): Unit = {

        //new User().test()
        //User.xxxx()
        //println(User)

        new User()
        // apply方法不是专门用于创建伴生类对象
        // 仅仅是一个可以被编译器识别的方法
        // apply方法是可以创建其他类型的对象
        val d = User() // User.apply()
        println(d)
    }
    // 伴生类
    class User() {
        // 成员方法
        def test(): Unit = {

        }
    }
    // 伴生对象
    object User {
        def apply(): java.util.Date = new java.util.Date()
        // 静态语法
        def xxxx(): Unit = {

        }
    }

}
