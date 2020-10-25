package com.teacher.scala.day04.chapter06

object Scala14_Object_Trait3 {

    def main(args: Array[String]): Unit = {

        // TODO 多个特征的混入和使用
        // 特质的初始化顺序
        // 从左到右依次初始化，但是如果存在上下级关系的特质，先初始化上级，然后再初始化下级
        new User()
        // 如果特质和父类同时存在，那么初始化应该先操作父类，然后在初始化特质

        /*
        aaaaaaa
        bbbbbbb
        ppppppp
        cccccc
        uuuuuuu
         */
    }
    trait A {
        println("aaaaa")
    }
    trait B extends A{
        println("bbbbbb")
    }
    trait C {
        println("cccccc")
    }
    class Parent extends B {
        println("ppppp")
    }
    class User extends Parent with C with B with A{
        println("uuuuuu")
    }
}