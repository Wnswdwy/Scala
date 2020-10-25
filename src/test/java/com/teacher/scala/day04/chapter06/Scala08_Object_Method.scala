package com.teacher.scala.day04.chapter06

import scala.beans.BeanProperty

object Scala08_Object_Method {

    def main(args: Array[String]): Unit = {

        // TODO 类的方法
        // 类的方法其实就是类中声明的函数
        // 遵循方法的限制和约束(重载和重写)
        // scala中方法的重载和重写和java一样
        val user = new User();
        user.test()

    }
    class User {

        def test(): Unit = {

        }
    }

}