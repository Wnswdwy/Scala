package com.teacher.scala.day03.chapter06

class Emp {

    }
    object Scala02_Object_Package {
            def main(args: Array[String]): Unit = {

                // TODO 面向对象编程 - package

                /*
                   java 中 package 作用？
                   1. 管理类 ： Chapter01_Scala01_HelloWorld
                   2. 区分类 ： DateSQL, DateUtil
                   3. 包访问权限 :

                   马丁说：能不能给package语法提供更加强大的功能。
                   1. 包名和源码文件的物理路径没有关系
                   2. package可以多次声明使用
                   3. package可以体现上下级关系
                   4. 在同一个源码中，上级包声明的内容，在子包中使用可以不需要导入
                   5. 将package当成一个对象, 其中声明的属性和方法可以在子包中直接用
                 */
                new Emp()

                login()

            }

        }



