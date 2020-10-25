package com.teacher.scala.day06.chapter07

import scala.collection.mutable

object Scala08_Collection_Tuple {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Tuple
        // 将无关数据封装为一个整体来使用，这种特定的结构称之为元组

        val t = (
                1,2,3,4,5,6,7,8,9,0,
                1,2,3,4,5,6,7,8,9,0,
                1,2
        )
        // 元组有专门的类型：TupleX
        // 理解起来不方便，所以还可以用另外的方式声明类型
        val t1 : (Int, String, Int) = (1, "zhangsan", 30)
        // 元组中元素的数量最多能放置22个。这里强调的是元素的数量，而没有限制元素的类型

        // 元组通过顺序号进行访问
        println(t1._1)

        // 通过索引进行访问
        t1.productElement(0)

        // 通过迭代器访问
        t1.productIterator

        // 如果一个元组中的元素的数量为2，那么称之为对偶元组，也称之为键值对

        println(t)

    }
}
