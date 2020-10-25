package com.teacher.scala.day02.chapter05

object Scala04_Function_NightMare {

    def main(args: Array[String]): Unit = {

        // 噩梦
        // 马丁：能不能让函数式编程变的简单一些。
        //       如果我能猜出来的话，那么开发人员就不用写代码。
        //       这种思想就转变为一个规则：至简原则（能省则省）
//        def f1( name : String ): String = {
//            return "Name : " + name
//        }
//        println(f1("zhangsan"))

        // TODO 1. 如果明确声明返回值类型，那么return可以省略
        def f1( name : String ): String = {
            //return "Name : " + name
            "Name:" + name
        }
        //println(f1("zhangsan"))

        // TODO 2. 如果能够通过代码的逻辑推断出返回值类型，那么返回值类型可以省略
        def f2( name : String ) = {
            //return "Name : " + name
            "Name:" + name
//            val age = 20
//            if ( age == 20 ) {
//                20
//            } else {
//
//            }
        }
        //println(f2("zhangsan"))

        // TODO 3. 如果函数的主体内容只有一行代码，那么大括号可以省略的
        //def f3( ) = "zhangsan"

        // TODO 4. 如果参数列表中没有声明参数，那么参数列表的小括号可以省略
        //def f4 = "zhangsan"
        //val f44 = "zhangsan"

        // 如果函数省略了参数列表，那么在调用时不能使用小括号
        //println(f4)
        //f4

        // TODO 5. 如果想要将函数不返回任何值，并且不想声明Unit类型，可以连同等号一起省略
        // 如果函数明确声明为Unit，那么函数体中return不起作用
        // 如果函数体中存在return关键字，那么需要明确返回值类型，不能省略
        // 省略了等号的函数称之为过程函数
//        def f5() {
//            //return "zhangsan"
//            "zhangsan"
//        }
//
//        println(f5())

        // TODO 6. 如果只关心函数的实现逻辑，而不关心名称，那么可以将关键字和名称同时省略
        //         没有名称的函数，称之为匿名函数
        //         匿名函数不能直接被调用，一般会赋值给变量来使用，这个变量可以简单认为是函数名称
//        def sum(x:Int, y:Int) :Int = {
//            x + y
//        }

        val f = (x:Int, y:Int) => { x + y }

        println(f(10, 20))


//        List(1,2,3,4).reduce(
//            (x:Int, y:Int) => {
//                x + y
//            }
//        )
//        List(1,2,3,4).reduce(_+_)
    }
}
