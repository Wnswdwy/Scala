package com.teacher.scala.day04.chapter06

object Scala09_Object_Instance1 {

    def main(args: Array[String]): Unit = {

        // TODO 创建对象
        //val user = new User() // 调用类的构造方法
        // 如果想要声明多个构造方法，那么需要提供类的辅助构造方法
        // scala中类的构造方法分为2大类，一类是主构造方法，一类是辅助构造方法
        // 主构造方法其实就是类名后面的参数列表
        // 辅助构造方法用于辅助主构造方法创建对象
        // 主要用主构造方法创建对象，完成类的初始化操作，通过辅助构造方法完成功能的补充
        // 辅助构造方法不能独立使用，必须直接或间接调用主构造方法
        // 主构造方法不是一定为无参的构造方法

        val user = new User("zhangsan", 30)

    }
    // 主构造函数
    class User( name:String ) {

        println("xxxxxxx")

        // 辅助构造方法 ： this
        def this() = {
            this("zhangsan")
            println("yyyy")
        }
        def this( name : String, age:Int ) = {
            this()
            println("zzzzz")
        }


    }

}