package com.teacher.scala.day04.chapter06

object Scala11_Object_Abstract {

    def main(args: Array[String]): Unit = {

        // 抽象类无法创建对象
        val user = new Child();
    }

    // 不完整的类称之为抽象类
    abstract class User {

    }
    abstract class Person {
        // 不完整的 方法称之为抽象方法
        // 如果一个类中存在抽象方法，那么这个类就是抽象类，或者将方法补充完整
        def run():Unit
        // 不完整的属性称之为抽象属性
        // 抽象属性在编译时，不会产生属性，只会产生属性对应的set,get抽象方法
        var name : String
    }
    // 如果子类继承的父类为抽象类，那么要么将类声明为抽象类，要么将抽象方法补充完整
    // 补充完整其实就是方法的重写
    // 如果父类存在抽象属性，那么子类要么声明为抽象的要么将属性补充完整
    class Child extends Person {
        var name : String = "zhangsan"
        def run():Unit = {

        }
    }

}