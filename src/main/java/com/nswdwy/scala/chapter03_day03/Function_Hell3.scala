package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 18:35
 */
object Function_Hell3 {
  def main(args: Array[String]): Unit = {

    // TODO 匿名函数
    def test(name:String): Unit ={
      println(name)
    }
    def ff(test:String=>Unit): Unit ={
      test("zhang_san")
    }

    ff(test)
    ff(test:String=>Unit)
    ff((name:String) => {println(name)})
    ff(name => println(name))
   /*
       ff(_ => println(_))  //错误
         //Error:(22, 21) missing parameter type for expanded
      //function ((x$2: <error>) => println(x$2))

    */
    //ff(_ => println(_))//错误
    ff(println(_))//匿名函数最简版
    //扩充
    ff(println) //函数就叫println



  def fun(m:Int,n:Int,f:(Int,Int) => Int) = {
       f(m,n)
    }

    println(fun(12, 10, (x, y) => x + y))
    println("-------------------------")
    println(fun(12, 11, _ + _))
    println("-------------------------")
    println(fun(11,11,_ - _))
    println("-------------------------")
    println(fun(11,11,_ * _))
    println("-------------------------")
    println(fun(11,11,_ / _))



  }
}
