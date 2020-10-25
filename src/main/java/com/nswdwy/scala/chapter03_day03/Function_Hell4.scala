package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 18:35
 */
object Function_Hell4 {
  def main(args: Array[String]): Unit = {

    // TODO 函数作为返回值

    def test () = {
      def ff() = {
        println("lslsls")
      }
      ff _
    }

    println(test()) //只执行到第一层，获取到ff的地址值
    test()() //执行到第二层





  }
}
