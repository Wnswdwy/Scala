package com.teacher.scala.day01.chapter01

/*
   1. object : 声明类的关键字, 可以同时声明对象

   2. Scala01_HelloScala ： 类的名称，同时也是对象名称

   3. def : defined(声明) 函数（方法）的关键字

   4. main : 方法名称

   5. (...) : 方法名称后面紧跟着的小括号，表示参数列表，多个参数用逗号隔开

   6. args : Array[String] : 方法的参数

       args : 参数名
       Array[String] : 参数类型

       java  => 参数类型   参数名称 => 强类型的语言 => 更看重类型
       scala => 参数名称 : 参数类型 => 强类型的语言 => 更看重用法

       中文 => 我  喜欢 那个喜欢我的  你
       英文 => i  like the one who like  me

       scala更关心怎么使用参数，所以名称在前。

    7. Array[String] ： Scala语言是完全面向对象的语言，所以数组在scala中也是类

        java  => String[]
        scala => Array[String]

    8.  java => method => String test()
       scala => method => test() : String

    9. Unit : Scala语言是完全面向对象的语言
             java   => void
             scala => Unit

    10. java => User user = new User()
        scala => method = 方法体对象

    11. 大括号表示方法体

    12. System.out.println
        scala语言是基于java开发的，所以java的代码可以直接在scala中使用
        也可以使用scala自己的打印语句

    13. scala语言可以省略代码最后的分号
        一般会每一行完成一段逻辑的代码的编写，所以就不需要使用分号区分逻辑，用换行符
        如果一行代码中含有多个逻辑，那么就不能省略分号




 */
object Scala01_HelloScala {

    def main(args: Array[String]): Unit = {
        //System.out.println("Hello Scala")
        println("Hello Scala") ;println("Hello Scala")
    }
}
