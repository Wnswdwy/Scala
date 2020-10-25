package com.teacher.scala.day04.chapter06

object Scala13_Object_Trait {

    def main(args: Array[String]): Unit = {

        // TODO Scala中没有接口的概念，可以将多个类中相同的特征剥离出来，形成独立的结构，称之为特质
        //      使用trait关键字来声明
        // java中所有的接口在scala中都是按照特质来使用
        // 如果一个类符合某一个特征，那么就可以将类混入特征
        // 使用extends关键字混入

        // 特质在编译后其实就是interface，而混入的类编译后其实就是实现interface
        // 特质中可以声明抽象方法的，那么混入的类也应该重写这个抽象方法。

        new Person();

    }
    // 声明特质（特征）
    trait Runnable {
        // 声明抽象方法
        def run() : Unit
        def test(): Unit = {

        }
    }
    // 声明类，混入特征
    class Person extends Runnable {
        def run() : Unit = {

        }
        override def test(): Unit = {

        }
    }
}