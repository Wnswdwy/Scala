package com.teacher.scala.day01.chapter02

object Scala02_Var {

    def main(args: Array[String]): Unit = {

        // 变量 ： scala中采用var|val关键字声明变量
        //         var 声明的变量，值是可以修改的
        //         val 声明的变量，值不能修改的, 不能使用final替代


        // java => 变量类型  变量名称  = 变量值
        // scala => var 变量名称 : 变量类型 = 变量值
        var  name : String = "zhangsan"
        name = "wangwu"
        // 马丁：能不能创建一个变量后，不让变量的值能改
        //      推荐使用val
        val username : String = "lisa"
        //username = "zhaoliu"

        println(name)
    }
}
