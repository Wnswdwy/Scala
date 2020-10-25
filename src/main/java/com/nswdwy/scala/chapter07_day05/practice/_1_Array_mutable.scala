package com.nswdwy.scala.chapter07_day05.practice

import scala.collection.mutable.ArrayBuffer

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _1_Array_mutable {
    def main(args: Array[String]): Unit = {
        /*
           Scala中数组的访问使用 ()
        */
        val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
        val arr2: ArrayBuffer[Int] = ArrayBuffer(3,4,5, 6)

        //追加数据
        arr1.append(1, 2, 3, 4)
        //插入 (insert)
        arr1.insert(1, 6)
        println("ins---"+arr1)

        //拼接
        println("1---"+arr1.++(arr2))
        //初始值
        println("arr1初始值:  "+arr1.init)


        //并集
        println("arr1,arr2并集： "+arr1.union(arr2))
        //拉链（两两匹配）
        println("拉链:   "+arr1.zip(arr2))

        val arrs3: ArrayBuffer[Int] = ArrayBuffer(1, 3, 5, 2, 9, 5)
        val iterator: Iterator[ArrayBuffer[Int]] = arrs3.sliding(2, 2)
        while (iterator.hasNext){
            println(iterator.next())
        }

    }

}
