package com.teacher.scala.day06.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala12_Collection_Method8 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 计算方法
        // scala集合提供了一些用于聚合数据功能函数，但是聚合的逻辑是不确定的，需要传递
        // Mapper(打散) - Reducer(聚合)
        // 1 => N => flatMap
        // N => 1 => reduce(简化，规约)

        // 将多个数据聚合成一条数据，但是聚合的规则不确定，需要通过函数来指定
        //
        val list = List(1,2,3,4,5)

        // scala中数据操作一般都是两两操作

        def reduceFunction(x:Int, y:Int): Int = {
            x + y
        }

//        val i: Int = list.reduce(reduceFunction)
//        val i: Int = list.reduce((x:Int, y:Int)=>{x + y})
//        val i: Int = list.reduce((x, y)=>{x + y})
//        val i: Int = list.reduce((x, y)=>x + y)

        // 从源码的角度来讲，reduce底层就是reduceLeft

        // 1,2,3,4,5

        // (A1, A1) => A1
        val i: Int = list.reduce(_-_) // -13

        // (B, A) => B
        val ii: Int = list.reduceLeft(_-_) // -13

        // reversed.reduceLeft[B]((x, y) => op(y, x))
        // 【1，2，3，4, 5】
        // 【5, 4，3，2，1】 => 4 - 5 => -1
        //                   => 3 -(-1) => 4
        //                   => 2 - 4 => -2
        //                   => 1 - (-2) => 3

        // left : ((((1-2)-3)-4)-5)
        // right : (1-(2-(3-(4-5))))

        val iii = list.reduceRight(_-_) // -5

        println(i)
        println(ii)
        println(iii)
    }
}
