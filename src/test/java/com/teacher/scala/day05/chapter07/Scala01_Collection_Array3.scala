package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala01_Collection_Array3 {

    def main(args: Array[String]): Unit = {

        // 创建Array的可变数组
       val arrayBuffer : ArrayBuffer[Int] = new ArrayBuffer[Int]()

        // 追加数据
        arrayBuffer.append(1,2,3,4)

        arrayBuffer.appendAll(Array(5,6,7,8))

        // 插入数据
        //arrayBuffer.insert(2, 5, 6) // 1，2，5，6，3，4

        // 更新数据
        //arrayBuffer.update(1, 10) // 1,2,3,4,5,6,7,8
        //arrayBuffer(1) = 10       // 1,10,3,4,5,6,7,8

        // 移除数据
        //arrayBuffer.remove(1)  // 1,3,4,5,6,7,8
        arrayBuffer.remove(1,3)  // 1,5,6,7,8

        println(arrayBuffer)
//        arrayBuffer.appendAll()

//        arrayBuffer.update()
//        arrayBuffer.remove()

    }
}
