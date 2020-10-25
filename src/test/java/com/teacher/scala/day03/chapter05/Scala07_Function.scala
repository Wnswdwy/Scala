package com.teacher.scala.day03.chapter05

object Scala07_Function {

    def main(args: Array[String]): Unit = {

        // 函数柯里化 - Curry
        val i = 100 // 5min
        val j = 200 // 10min

        def test( i : Int, j : Int ): Unit = {
            // 10min
            for ( a <- 1 to i ) {
                println(a)
            }

            // 15min
            for ( b <- 1 to j ) {
                println(b)
            }
        }

        // 科学家库里发现了方法参数必须全部准备完毕，才能调用函数
        // 但是如果参数之间没有关系，那么就导致性能下降。而且同时增加了业务复杂度。
        //test(i, j)
        // 所以可以将参数通过参数列表给分离开
        // 所以函数支持多个参数列表，每个参数列表表示一个含义，所以将复杂的逻辑简单化
        def test1(i:Int)(j:Int): Int = {
            i + j
        }

        //test1(10)(20)
        def operator( x:Int, y:Int )( op:(Int, Int)=>Int ) = {
            op(x, y)
        }

        println(operator(10, 20)(_ + _))

    }
}
