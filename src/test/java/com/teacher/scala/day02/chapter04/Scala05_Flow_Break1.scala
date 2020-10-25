package com.teacher.scala.day02.chapter04

import scala.util.control.Breaks

object Scala05_Flow_Break1 {

    def main(args: Array[String]): Unit = {

        // Scala中没有continue,可以采用if条件代替

        // Scala中没有break,因为不是面向对象的。通过使用面向对象的语法来代替
        Breaks.breakable{
            for ( i <- 1 to 10 ) {
                if ( i % 2 == 0 ) {
                    Breaks.break()
                }
                println(i)
            }
        }

        System.out.println("继续执行。。。")


    }

}
