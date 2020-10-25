package com.teacher.scala.day04.chapter06

object Scala11_Object_Abstract1 {

    def main(args: Array[String]): Unit = {

        new Child().run()
    }
    class Parent {
        val name : String = "zhangsan"
        def run(): Unit = {

            //name = "wangwu" // => name_$eq("wangwu") => Child => name => wangwu
            println(name)   // => name() => Child => name => wangwu

        }
    }
    class Child extends Parent {
        // scala中如果子类声明了和父类一样的属性，那么必须采用override关键字，明确声明
        override val name : String = "lisi"
        // scala中如果子类想要重写完整的方法，必须要明确告诉编译器，需要增加修饰符
        override def run(): Unit = {
            super.run()
        }
    }

}