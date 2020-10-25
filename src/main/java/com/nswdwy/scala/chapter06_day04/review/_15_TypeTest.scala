package com.nswdwy.scala.chapter06_day04.review

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _15_TypeTest {
    def main(args: Array[String]): Unit = {
        val name = "zhangsan"
        //用type给对象起别名
        type CC = typeTest
        val tt : CC = new typeTest()

    }
    class typeTest{
        println("------")
    }
}
