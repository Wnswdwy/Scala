package com.teacher.scala.day04.chapter06

object Scala10_Object_Extends {

    def main(args: Array[String]): Unit = {

        // TODO 类的继承和java一致的。是类的单继承
        // 子类继承父类
        // 继承父类的同时等同于调用父类的构造方法
        val child = new Child("zhangsan")
    }

    // 111111
    // 333333
    // 444444
    // 666666

    class Parent( name:String ) {
        println("1111")
        def this() {
            this("xxxxx")
            println("2222222")
        }
        println("33333")
    }
    class Child(name:String) extends Parent(name) {
        println("44444...")
        def this() {
            this("yyyyy")
            println("555555")
        }
        println("6666666")
    }
//    class SubChild extends Child {
//
//    }

}