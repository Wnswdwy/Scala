package com.teacher.scala.day03.chapter05

import scala.util.control.Breaks

object Scala06_Function1 {

    def main(args: Array[String]): Unit = {

        // TODO 控制抽象
        whileOperator(true) {
            println("zhangsan")
        }

    }
    def whileOperator( flg : Boolean ) = {
        def operator( op :  => Unit ) = {
            if ( flg ) {
                op
            }
        }
        operator _
    }
}
