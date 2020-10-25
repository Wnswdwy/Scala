package com.nswdwy.scala.chapter06_day04.pratice

/**
 * @author yycstart
 * @create 2020-10-21 16:06
 */
object TraitTest1 {

  def main(args: Array[String]): Unit = {
    new D()
  }


   trait A{
      println("AAAAAAA")
  }
  trait B extends  A{
      println("BBBBBBBB")
  }
  class C extends B {
       println("CCCCC")
  }
  class D extends C with A with B{
    println("DDDDDD")
  }
}
