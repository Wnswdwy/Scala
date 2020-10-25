package com.nswdwy.scala.chapter07_day06.practice

/**
 * @author yycstart
 * @create 2020-10-23 23:46
 */
object function_ProvinceShop {
  def main(args: Array[String]): Unit = {
    // 1. 获取数据集
    val list = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "电脑"),
      ("zhangsan", "河南", "电脑"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子")
    )

    val startMap: List[(String, Int)] = list.map(
      t => {
        val key: String = t._2 + "-" + t._3
        (key, 1)
      }
    )
    println(startMap)
    println("-----------------------------")
    val groupMap: Map[String, List[(String, Int)]] = startMap.groupBy(_._1)
    println(groupMap)
    println("--------------------------------")
    val basicMap: Map[String, Int] = groupMap.map(
      t => {
        val key: String = t._1
        val value: Int = t._2.map(_._2).sum
        (key, value)
      }
    )
    println(basicMap)
    println("------------------------------")
    val midList: List[(String, (String, Int))] = basicMap.toList.map(
      t => {
        val strings: Array[String] = t._1.split("-")
        val key: String = strings(0)
        val midvalue: String = strings(1)
        (key, (midvalue, t._2))
      }
    )
    println(midList)
    println("---------------------------------------")
    val lastMap: Map[String, List[(String, (String, Int))]] = midList.groupBy(_._1)
    /*println(lastMap)
    println("------------------------------------------")
    val finalMap: Map[String, List[(String, Int)]] = lastMap.map(
      t => {
        val key: String = t._1
        val value: List[(String, Int)] = t._2.map(_._2)
        (key, value)
      }
    )*/
//    println(finalMap)
//    println("-----------------------------------")
//    finalMap.mapValues(
//      list => {
//        val itemSumList = list.map(_._2)
//        itemSumList.sortBy(_._2)
//      }
//    )
    println(lastMap)
    println("-----------------------")
    val endResult: Map[String, List[(String, Int)]] = lastMap.mapValues(
      list => {
        list.map(_._2).sortBy(_._2)(Ordering.Int.reverse)
      }
    )
    println(endResult)
  }
}
