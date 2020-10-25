package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 20:48
 */
object function_Hell5 {
  def main(args: Array[String]): Unit = {
    //TODO 闭包

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
