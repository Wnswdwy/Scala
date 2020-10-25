package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版

        // 将函数当成对象来用
        // Scala是一个完全面向对象的语言，同时也是完全面向函数式编程的语言
        // 函数也是对象
        // 重复使用
        // User user = new User();
        // Person p = new User();
        // Object obj = new User();
        // user.name;
        // user.login();

        // TODO 将函数赋值给变量使用
        //      那么函数应该有类型，就是函数类型
        def test(): Unit = {
            println("f1....")
        }

        // 如果函数声明的参数列表没有参数，那么在调用时小括号可以省略
        val f1 = test
        val f2 = test()
        f1

        // 想将函数作为一个整体的对象赋值给变量，不想让这个函数执行
        // 可以采用特殊的符号来声明
        //val f = test _
        // User user = new User();
        //f()

        // 之所以之前使用函数赋值没有成功，因为编译器的自动推断功能
        // 如果将函数作为对象来使用，那么可以不需要推断功能
        // User user = new User()
        // = new User()
        // 函数类型的定义 ： In => Out
        //                   () => Unit
        val f3 : () => Unit = test
        f3()


    }
}
