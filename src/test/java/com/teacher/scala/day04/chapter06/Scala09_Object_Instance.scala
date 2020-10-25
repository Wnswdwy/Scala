package com.teacher.scala.day04.chapter06

object Scala09_Object_Instance {

    def main(args: Array[String]): Unit = {

        // TODO 创建对象
        val user = new User() // 调用类的构造方法
        // Scala中构造方法的名字不是和类名相同
        // Scala语言万物皆函数， 类也是函数
        // 类名的后面可以增加小括号的,这个小括号就是代表构造参数列表

        // Scala中类的主体内容其实就是类的构造方法体。
        // 当构建对象时，构造方法就会执行，同时类的主体内容也会执行，所以就体现初始化的概念

    }
    class User() {
        // 类的主体
        // 函数体
        //println("123")
    }

}