package com.atguigu.bigdata.scala.chapter06



object Scala07_Object_Access {

    def main(args: Array[String]): Unit = {

        // TODO - 访问权限
        // 所谓的权限，其实就是用户和服务之间的权利和限制


    }
}
package Acess_test1{
    package Acess_test2{
        class Test03 {
            private val t1: String = "zhangsan"
            private[Acess_test1] val age: Int = 12

            private def fun04(): Unit = {
                println("fun04...")
            }
        }
        class Test03_2{

        }


        }
    package Acess_test2_2 {

        class Test04_1 {
            private val t1: String = "zhangsan"

            private def fun04(): Unit = {
                println("fun04...")
            }
        }

        class Test04_2 {
            val t04_2 = "t04_2..."

//            private[Acess_test3] def fun_4_2(): Unit = {
//                println("fun_4_2.....")
//            }

        }

    }
}