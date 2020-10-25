package com.nswdwy.scala.chapter07_day06.practice

/**
 * @author yycstart
 * @create 2020-10-23 20:35
 */
object practice_HelloCount2 {
  def main(args: Array[String]): Unit = {
    val list = List(
      ("Hello Hive Hadoop Scala", 4),
      ("Hello Hive Hadoop", 3),
      ("Hello Hive", 2),
      ("Hello", 1)
    )
    val tuples: List[(String, Int)] = list.flatMap(
      t => {
        val keys: String = t._1
        val value: Int = t._2
        keys.split(" ").map(
          key => {
            (key, value)
          }
        )
      }
    )
    println(tuples)
    println("-----------------------------------")
    val midMap: Map[String, List[(String, Int)]] = tuples.groupBy(_._1)
    println(midMap)
    println("------------------------------------")
    val result: Map[String, Int] = midMap.map(
      t => {
        val key: String = t._1
        val value: Int = t._2.map(_._2).sum
        (key, value)
      }
    )
    println(result)

  }
}
