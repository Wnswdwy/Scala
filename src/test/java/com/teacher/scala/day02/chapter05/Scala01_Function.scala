package com.teacher.scala.day02.chapter05

object Scala01_Function {

    def main(args: Array[String]): Unit = {

        // 函数的声明
        /*
        【修饰符】 def 函数名( 参数1，参数2 ): 返回值类型 = {
             函数体
         }

         */

        // 函数和方法？
        // function & method
        // 函数表示将特定的功能进行封装，然后调用这个功能。
        // 方法其实也是类的功能的封装。然后通过这个类的对象访问方法
        // scala中方法其实就是函数。但是声明在特殊的地方（类中）。所以需要遵循方法的约束（限制）
        //       比如方法可以重载和重写的, 函数是不行的，
        //       在同一个作用域中，如果含有相同名称的函数会出现错误

        val s = "abc"

//        def upperFirst( s:String ): String = {
//            return s.substring(0,1).toUpperCase
//        }
//        def upperFirst(  ): String = {
//            return "123"
//        }
//        upperFirst(s)



    }
//    def upperFirst( s:String ): String = {
//        return s.substring(0,1).toUpperCase
//    }
//    def upperFirst( ): Unit = {
//        //return s.substring(0,1).toUpperCase
//    }
    def test(): Unit = {
//        def test1(): Unit ={
//
//        }
//        def test2(): Unit = {
//
//        }
//
//        test1()
//        test2()
    }
}
