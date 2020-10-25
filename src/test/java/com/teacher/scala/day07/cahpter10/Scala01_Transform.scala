package com.teacher.scala.day07.cahpter10

object Scala01_Transform {

    def main(args: Array[String]): Unit = {

        implicit def transform( d : Double ): Int = {
            d.toInt
        }


        // OCP
        // 编译器在编译时有可能编译不通过。
        // 尝试在作用域范围内查找可以让程序编译通过的逻辑
        // 然后使用这段逻辑进行二次编译，让编译通过
        // 需要对指定的逻辑增加标记，告诉编译器这个标记的函数可以进行二次编译
        // 相同作用域下，相同的隐式转换规则不同出现多次
        // *******************************
        val test = new Test()
        val age : Int = test.age

        println(age)
        // ******************************

    }
    // 第三方类库 1.0 -> 2.0
    class Test {

        val age : Double = 20.5
    }
}
