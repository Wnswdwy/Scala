package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell5 {

    def main(args: Array[String]): Unit = {

        // TODO 将函数作为返回值来使用
        def outer( x:Int ) = {
            def middle( y:Int ) = {
                def inner( f : (Int, Int) => Int ) = {
                    f(x, y)
                }
                inner _
            }
            middle _
        }

        println(outer(10)(10)(_ + _))
        println("------------------")

        def f1 = outer(20)
        def f2 = f1(2)
        print(f2(_ + _))





    }
}
