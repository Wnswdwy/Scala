package com.nswdwy.scala.chapter07_day06.practice

import scala.collection.mutable

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _4_Set1 {
    def main(args: Array[String]): Unit = {
        //TODO
        val set: mutable.Set[Int] = mutable.Set(1,2,3,4,5,6)
        val bool: Boolean = set.add(6)
        val bool1: Boolean = set.add(7)
        println(bool)
        println(bool1)
        // += 相当于将改变后的集合重新赋给原来集合，因此集合地址未改变
        val value: set.type = set += 7
        //即使可变集合 + 操作也会创建新的集合
        val values: mutable.Set[Int] = set + 7
        println(set eq value)
        println(set eq values)

    }
}
