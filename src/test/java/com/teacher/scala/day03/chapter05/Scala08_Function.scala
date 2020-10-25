package com.teacher.scala.day03.chapter05

object Scala08_Function {

    def main(args: Array[String]): Unit = {

        // TODO 递归
//         1. 函数自己的逻辑处理中调用自己
//         2. 递归函数应该有跳出递归逻辑
//         3. 递归在调用时传递的参数应该有规律
//         4. scala中递归函数必须显示声明返回值类型

        //  阶乘
        // 递归算法有问题
        //println(test(100000000))

//         scala语言中尾递归会在编译时，优化为while循环，所以不会出现问题
//         java中也有尾递归，但是不能优化。也会出现问题，但是出问题的时间要晚于普通递归
        test1()

    }
    // 尾递归 tail
    def test1(): Unit = {
        println("abc")
        test1()

    }
    // 递归
//    def test( num:Int ):Int = {
//        if ( num <= 1 ) {
//            1
//        } else {
//            num * test(num-1)
//        }
//    }
}
