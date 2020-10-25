package com.teacher.scala.day02.chapter05

object Scala02_Function {

    def main(args: Array[String]): Unit = {

        // IO
        // TODO 无参，无返回值函数
        def f1(): Unit = {
            println("f1...")
        }
        //f1() // 调用函数1
        //f1   // 调用函数2，如果函数没有参数，那么可以在调用时省略小括号

        // TODO 无参，有返回值函数
        def f2(): String = {
            return "zhangsan"
        }

//        val name = f2()
//        val name1 = f2
//        println(name)
//        println(name1)

        // TODO 有参，无返回值函数
//        def f3( s : String ): Unit = {
//            println("name = " + s)
//        }
//
//        f3("zhangsan")

        // TODO 有参，有返回值函数
//        def f4( s : String ): String = {
//            return "Name : " + s
//        }
//
//        val name = f4("lisi")
//        println(name)

        // TODO 多参，无返回值函数
//        def f5( name:String, name1 : String ): Unit = {
//            println(name + ", " + name1)
//        }
//
//        f5("zhangsan", "lisi")

        // TODO 多参，有返回值函数
        def f6( name:String, name1:String ): String = {
            return "名称列表为：" +  name + ", " + name1
        }

        val namelist = f6("zhangsan", "lisi")
        println(namelist)

        // 参数的个数没有限制的，想传多少传多少
    }
}
