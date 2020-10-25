package com.teacher.scala.day02.chapter04

object Scala03_Flow_for1 {

    def main(args: Array[String]): Unit = {

        // 循环守卫
//        val a : Range = 1 to 5
//
//
//        for ( i <- Range(1,5) if i != 3 ) {
//            if ( i != 3 ) {
//                println(i)
//            }
//
//        }

        // 循环步长
//        for ( i <- Range(1,5, 2)  ) {
//            println(i)
//        }

        // 循环嵌套
        for ( i <- Range(1,5) ) { // i=3
            for ( j <- Range(1,4) ) { // j = 1,2,3
                println("i = " + i + ",j = " + j )
            }
        }
        for ( i <- Range(1,5); j <- Range(1,4) ) {
            println("i = " + i + ",j = " + j )
        }

        // 循环引入变量
        for ( i <- Range(1,5); j = i - 1 ) {
            println("j = " + j )
        }


    }

}
