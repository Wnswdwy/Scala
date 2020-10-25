package com.nswdwy.scala.chapter02

/**
 * @author yycstart
 * @create 2020-10-19 15:24
 */
object test {
  def main(args: Array[String]): Unit = {
    //无参无返回值
    def f1(): Unit ={
      println("f1...")
    }
    //无参有返回值
    def f2(): String ={
      val s :String = "f2..."
      return s;
    }
    //有参无返回值
    def f3(s :String ): Unit ={
      println(s)
    }
    //有参有返回值
    def f4(): Unit ={

    }
    //多参无返回值
    def f5(): Unit ={

    }
    //多参有返回值
    def f6(): Unit ={

    }
  }

}
