package com.teacher.scala.day02.chapter04

object Scala02_Flow_If {

    def main(args: Array[String]): Unit = {

        // TODO if
        val age : Int = 30
//        if ( age == 20 ) {
//            println("年龄等于20")
//            println("年龄不等于20")
//        }
//        if ( age == 30 ) {
//            println("年龄等于30")
//        } else {
//            println("年龄不等于30")
//        }

        if ( age < 16 ) {
            println("少年")
        } else if (  age < 30 ) {
            println("青年")
        } else if (  age < 45 ) {
            println("壮年")
        } else if (  age < 60 ) {
            println("中年")
        } else {
            println("老年")
        }

    }

}
