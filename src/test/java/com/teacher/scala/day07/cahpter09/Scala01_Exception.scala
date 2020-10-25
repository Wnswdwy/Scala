package com.teacher.scala.day07.cahpter09

import java.io.IOException

object Scala01_Exception {

    def main(args: Array[String]): Unit = {

        // 鲁棒性 => 健壮性
        // 编译期异常 => 提示性异常
        // 运行时异常 => BUG
        // 马丁说： 异常不要分类
        // Scala中任何的异常都不需要显示的处理
        //throw new Exception

        // 异常处理和模式匹配非常类似
        /*
          try {

          } catch ( java.lang.ArithmeticException e ) {

          } catch ( Exception e ) {

          }


         */
        //  scala中捕捉多个异常时，范围小的异常应该在前，范围大的异常应该在后
        // 如果没有匹配任务的异常，那么会直接将异常抛出给JVM
        try {
            val x = 0
            val y = 10 / x
        } catch  {
            case io : IOException => println("io")
            //case e : java.lang.ArithmeticException => println("yyyyy")
            //case e : Exception => println("xxxxxx")
        } finally {

        }

    }
}
