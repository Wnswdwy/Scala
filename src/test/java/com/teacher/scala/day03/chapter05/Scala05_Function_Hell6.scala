package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell6 {

    def main(args: Array[String]): Unit = {

        // TODO 将函数作为返回值来使用

//         1) outer函数 => class文件中一定是方法
//         2) 参数x编译后应该是方法的局部变量，当前方法的内部有效
//         3) inner函数 => classw文件中一定是方法
//         4) inner方法执行时间点，在outer方法执行后
//         5) outer方法如果执行完了，会弹栈，其中的局部变量也会同时回收
//         6) inner凭什么能用x? 因为进行了特殊的操作

//         一个函数如果使用了外部的变量，那么这个变量需要改变生命周期
//         这个时候函数将这个变量包含到函数的内部，形成一个闭合效果
//         这个效果（环境）称之为闭包
//         Scala2.12, 早期版本闭包采用的是匿名内部类实现
        def outer ( x:Int ) = {
            def inner( y : Int ) = {
                x + y
            }
            inner _
        }

        // outer => inner
        /*

          public void test() {

          }
          test()
          test()

         */
        val f = outer(20)
        println(f(20))
        println(outer(20)(10))




    }
}
