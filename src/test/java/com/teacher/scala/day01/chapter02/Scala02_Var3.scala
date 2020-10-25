package com.teacher.scala.day01.chapter02

object Scala02_Var3 {

    def main(args: Array[String]): Unit = {


        // 马丁：如果通过编译器可以推断出语法的话，那么语法可以省略，在编译时，由Scala自动补全

        //val username : String = "zhangsan"
        // 如果通过变量的值可以推断出变量的类型，那么类型可以省略的。
        // 类型自动推断功能不能在多态中使用。
        val username = "zhangsan"

        // Scala中的变量在声明的时候必须初始化，否则发生错误
        val name : String = "lisi"

        var email : String = "xxxx@xxxx.com"
        //email = true



        println(username)
    }
}
