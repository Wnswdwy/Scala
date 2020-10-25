package com.atguigu.bigdata.scala.chapter06

import com.atguigu.bigdata.scala.chapter06.test.subtest1.TestAAA


object Scala07_Object_Access {

    def main(args: Array[String]): Unit = {

        // TODO - 访问权限
        // 所谓的权限，其实就是用户和服务之间的权利和限制
        /*
           以方法为例，方法的提供者和方法的调用者之间的关系
           java :
               1. private   : 私有 (同类)
               2. (default) : 包访问 (同类，同包)
               3. protected : 受保护权限 (同类，同包，子类)
               4. public    : 公共的 (任意)

          scala : 和java一样，也分为4种访问权限，但是不尽相同
               1. private         : 私有
               2. private[包名]   : 包访问权限, 包私有, 指定的包和子包都能访问
               3. protected       : 受保护权限 只能同类和子类访问，同包不能访问
               4. (public)        : 公共的

         */

        val aaa = new TestAAA()
        //aaa.sex
        //aaa.name
        //aaa.age
    }
}
package test {

    package subtest1 {


        class TestAAA {
            private var name : String = "zhangsan"
            private[test] var age : Int = 30
            protected var email : String = "zzzzz"
            var sex : String = "xxxx"

        }
        class TestCCC {
            def test(): Unit = {
                val aa = new TestAAA()
                println(aa.age)
                aa.sex
                //aa.email
            }
        }
    }

    package subtest2 {

        import com.atguigu.bigdata.scala.chapter06.test.subtest1.TestAAA

        class TestBBB extends TestAAA {

            def test(): Unit = {
                //println(name)
                println(age)
                println(email)
                println(sex)
            }
        }

    }

}
