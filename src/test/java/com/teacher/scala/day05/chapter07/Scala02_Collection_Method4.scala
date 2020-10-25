package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Method4 {

    def main(args: Array[String]): Unit = {

        val strings = new Array[String](10)
        // TODO 集合 - 功能函数
        val buffer = ArrayBuffer(1,2,3,4)
        val stringBuffer = ArrayBuffer("Scala", "Hive", "Flume")
        // A => B (转换，映射)
        // Scala => S
        // Hive => H
        // Flume => F

        // Int => B
        def mapFunction(num:Int): Int = {
            num * 2
        }

        // map方法可以实现这样的功能：
        // 数据集中的每一条数据通过执行函数进行转换，这个转换没有特定的规则
//        println(buffer.map(mapFunction))
//        buffer.map( (num:Int)=>{num * 2} )
//        buffer.map( (num)=>{num * 2} )
//        buffer.map( num=>{num * 2} )
//        buffer.map( num=>num * 2 )
        //println(buffer.map(_ * 2))
        //println(stringBuffer.map(_.substring(0, 1)))

        // 扁平化
        // 所谓的扁平化，其实就是将整体进行拆分，形成个体来使用
        val buffer1: ArrayBuffer[ArrayBuffer[Int]] = ArrayBuffer(
            ArrayBuffer(1, 2), ArrayBuffer(3, 4)
        )

        // 1,2,3,4
        // buffer(), buffer()
        //println(buffer1)
        //val flatten: ArrayBuffer[Int] = buffer1.flatten
        //println(flatten)

        // "Hello Scala Hive" => "Hello", "Scala", "Hive"
        val wordBuffer = ArrayBuffer("Hello Scala Hive", "Hello World")

        //println(wordBuffer.flatten)
        // 扁平映射
        // 1 -> N
//        println(wordBuffer.flatMap(
//            str => {
//                str.split(" ")
//            }
//        ))
        println(wordBuffer.flatMap(_.split(" ")))
    }
}
