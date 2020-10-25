package com.teacher.scala.day05.chapter07

object Scala01_Collection_Array2 {

    def main(args: Array[String]): Unit = {

        // 创建数组
        //new Array[String](5)
        //Array.apply(1,2,3,4)
        // 使用Array的伴生对象来创建数组，传递参数
        val ints1: Array[Int] = Array(1,2,3,4)
        val ints2: Array[Int] = Array(5,6,7,8)

        val ints3: Array[Int] = ints1 ++: ints2

        //println(ints3.mkString(","))

        // 多维数组
        //var myMatrix = Array.ofDim[Int](3,3)
        //myMatrix.foreach(list=>println(list.mkString(",")))

        val arr6: Array[Int] = Array.concat(ints1, ints2)
        //arr6.foreach(println)

        // 创建指定范围的数组
        val arr7: Array[Int] = Array.range(0,2)
        //arr7.foreach(println)

        // 创建并填充指定数量的数组
        val arr8:Array[Int] = Array.fill[Int](5)(-1)
        arr8.foreach(println)


    }
}
