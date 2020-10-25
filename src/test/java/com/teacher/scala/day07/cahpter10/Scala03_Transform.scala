package com.teacher.scala.day07.cahpter10

object Scala03_Transform {

    def main(args: Array[String]): Unit = {

        // 隐式参数
        def reg( implicit password : String = "000000" ): Unit = {
            println("密码为 " + password)
        }

        // 隐式变量
        implicit val password : String = "123123"
//        implicit val xxxxx : String = "111111"

        // 隐式参数和隐式变量应该是类型统一

        // 如果应用隐式参数，那么小括号可以省略
        reg
        // 如果没有省略，那么隐式参数不起作用，默认值起作用
        reg()
        // 如果传递参数，那么传递的就是最终参数
        reg("456456")

        val list = List(1,4,3,2)

//        println(list.sortBy(num => num))
//        println(list.sortBy(num => num)(Ordering.Int.reverse))


//        def test( x:Int )(y:Int): Int = {
//            x + y
//        }
//
//        println(test(10))
    }
}
