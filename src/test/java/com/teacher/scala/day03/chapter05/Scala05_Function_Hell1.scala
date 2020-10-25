package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版
        def test1( i : Int ): Int = {
            i * 2
        }
        // 函数类型：  In => Out
        // 函数类型中，如果参数列表只有一个参数，小括号可以省略，但是如果没有参数，一般不能省略
        val f:(Int)=>Int = test1
        val f1:Int=>Int = test1
//        println(f(10))
//        println(f1(10))

        def test2( name : String, password:String ): String = {
            name + "," + password
        }
        def test3( name : String, password:String ): String = {
            name + "," + password
        }

        val f2 : (String, String)=> String = test3
        //val f2 : (String, String)=> String = test2
        //val f2 = test2 _
        //f2
        println(f2("zhangsan", "123123"))


    }
}
