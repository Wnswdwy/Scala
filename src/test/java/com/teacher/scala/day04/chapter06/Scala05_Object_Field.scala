package com.teacher.scala.day04.chapter06

object Scala05_Object_Field {

    def main(args: Array[String]): Unit = {

        val user = new User()

        // 当访问对象的属性时，其实不是访问这个属性，是访问这个属性的get方法
        println(user.age)
        // 当给对象的属性赋值时，其实是访问这个属性的set方法进行赋值
        user.name = "zhangsan"

        //user.sex = "232323"

        //user.name = "lisi"
        //user.email = "xxx"

    }
    class User {

        /*
      private String name;
      private int age;
         */



        // 声明属性 ： scala中类的属性其实就是类中变量
        //var name : String = "zhangsan"
        //val email : String = "zhangsan@test.com"
        // 抽象属性
        // 如果想要类似于java的属性默认初始化，那么可以采用下划线赋值
        // Scala中类的属性在编译为class文件时，是私有的属性，但是同时会编译出属性的2个方法，用于访问这个属性
        // 这两个方法类似于set,get方法
        var name : String = _
        var age : Int = _
        // 使用val声明的变量不能使用下划线进行赋值
        // 使用val声明的变量在编译时采用的是final修饰
        // 使用val声明的变量在编译时不会产生set方法，所以无法修改
        val sex : String = "1111"
        //var name : String = null

    }

}