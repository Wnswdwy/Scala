package com.teacher.scala.day02.chapter04

object Scala03_Flow_for {

    def main(args: Array[String]): Unit = {

        /*
        java

        for ( int i = 0; i < 10; i=i+2 ) {
            sout( i )
        }

        JDK1.5
        javac.exe
        for ( Object obj : list ) {
           sout(obj)
        }

         */

        // Scala中循环和JAVA中的增强for循环很类型
        val range = 1 to 5 // from 1 to 5 => 1,2,3,4,5
        //1.to(5)

        val range1 = 1 until 5 // from 1 to 5 => 1,2,3,4
        //1.until(5)

//        for ( i <- range1 ) {
//            println(i)
//        }

        for ( c <- "abc" ) {
            println(c)
        }


    }

}
