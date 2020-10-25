package com.teacher.scala.day04.chapter06

object Scala03_Object_Import {

    def main(args: Array[String]): Unit = {

        // TODO import
        /*

           java : import 导类
                  import static  静态导入(属性，方法)

           马丁说：能不能对功能进行扩展
         */
        // 1. Scala可以导包
        //new util.Date()

        // 2. java中采用星号导入包中所有的类，但是scala采用的下划线
        // import java.util._

        // 3. import关键字可以在任意的位置的使用
        //import java.util.Date
        //val d = new Date()

        // 4. 如果需要导入同一个包中大量的类，但是又没有下划线,可以写在一行当中
        //import java.util.{List, Map, ArrayList, HashMap}

        // 5. 如果导入不同包中有相同的类，那么会有冲突，可以隐藏类
//        import java.util._
//        import java.sql.{Date=>_, _}
//        new Date()

        // 6. java中java.lang包中的类是默认导入的，无序显示声明
        //    scala中java.lang包中的类可以直接使用，无需导入
        //    scala中scala包中的类可以直接使用，无需导入
        //    scala中Predef类可以直接使用，无需导入
        //println("abc")

        // 7. scala中的import采用的是相对包路径来导入，以当前包为基准进行导入
        //    可以采用绝对包路径进行访问
        println(new _root_.java.util.HashMap())

    }
}
//package java {
//    package util {
//        class HashMap {
//            //override def finalize(): Unit = super.finalize()
//        }
//    }
//}
