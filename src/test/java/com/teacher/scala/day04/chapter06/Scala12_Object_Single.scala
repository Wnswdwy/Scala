package com.teacher.scala.day04.chapter06


object Scala12_Object_Single {

    def main(args: Array[String]): Unit = {

        Person.test()
//        UserXXX.test()
        println("xxxxxxxxxxxxx")
    }
    // java中单例对象
//     1. 构造方法私有化
//     2. 静态返回本类型，公共的方法
//     3. 静态属性
    // scala中单例对象
//     1. 主构造函数的前面增加private，辅助构造方法前也可以将private
//     2. Scala中没有静态操作。

     class User private() {

        private def this( name:String ) ={
            this()
        }
    }
//     3. Scala中采用特殊的关键字(object)直接声明单例对象
//        object关键字可以声明类，同时可以声明单例对象
//        将这个对象称之为伴生对象, 将对应class关键字声明的类称之伴生类
    object Person {
        def test(): Unit = {

        }
    }
}