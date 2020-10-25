package com.teacher.scala.day05.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection_Method5 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 功能函数
        val buffer = ArrayBuffer(1,2,3,4)
        // TODO filter
        // 将数据集中的每一条数据进行过滤函数，当结果为true，数据保留，如果为false，数据丢弃
        def filterFunction( num:Int ): Boolean = {
            num % 2 == 1
        }
//        println(buffer.filter(filterFunction))
//        println(buffer.filter(_ % 2 == 1))

        // TODO groupBy
        // 根据指定的规则对数据集中的数据进行分组
        def groupFunction(num:Int): Int = {
            num % 2
        }
        // 1 => 1
        // 2 => 0
        // 3 => 1
        // 4 => 0
        // 分组后的数据应该是Map (K - V)
        // K - 分组的key
        // V - 相同key的数据集
        //println(buffer.groupBy(groupFunction))

        val stringBuffer = ArrayBuffer( "Hello", "Hadoop", "Scala", "Spark" )

        //println(stringBuffer.groupBy(_.substring(0, 1)))

        // Scala中的键值对对象是一个特殊的集合
        // K - V
        // 在Scala中，可以将无关的数据作为整体使用，这个整体是一个特殊的集合，称之为元组
        // 所谓的元组(tuple)，其实就是多个元素的组合。声明时用小括号即可
        // 因为元组中的数据没有关系，所以一般是通过顺序号来访问
        val t = (1,  "zhangsan", 30)
        println(t._1)
        println(t._2)
        println(t._3)

        // Scala中键值对对象就是元组,将只有两个元素的元组称之为键值对，也称之为对偶元组
    }
}
