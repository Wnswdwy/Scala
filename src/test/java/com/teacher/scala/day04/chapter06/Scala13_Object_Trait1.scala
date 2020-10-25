package com.teacher.scala.day04.chapter06

object Scala13_Object_Trait1 {

    def main(args: Array[String]): Unit = {

        // TODO 特质也可以继承类
        // 特质可以理解为接口和抽象类的结合体。
        //new Person()

        // 如果一个类有父类，同时又想混入特征。
        // 那么需要使用extends关键字继承父类，使用with关键字来混入特征
        // 如果有多个特征需要混入，那么需要多个with

        // 如果没有父类，只有特征，那么可以使用extends关键字来混入特征

    }

    trait Runnable extends Exception {

    }
    class Parent {

    }

//    class Person extends Parent with Runnable {
//
//    }
}