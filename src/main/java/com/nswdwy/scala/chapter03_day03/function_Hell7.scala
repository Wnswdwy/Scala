package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 20:48
 */
object function_Hell7 {
  def main(args: Array[String]): Unit = {
    //TODO 函数柯里化


  /*  val m = 10
    val n = 15
    def f1(m:Int,n:Int) = {
        for(i <- 1 to m){
          println(i)
        }
      for(j <- 1 to n){
        print(j)
      }
      */
    def test(m:Int,n:Int) = {
      m + n
    }

    def test1(m:Int,n:Int)(op:(Int,Int)=>Int) = {
      op(m,n)
    }


    println(test(12, 11))
    println("-----------")
    println(test1(10, 12)(_ + _))


  }
}
