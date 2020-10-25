package com.nswdwy.scala.chapter07_day06.practice

/**
 * @author yycstart
 * @create 2020-10-23 20:35
 */
object practice_HelloCount {
  def main(args: Array[String]): Unit = {
    val list = List(
      ("Hello Hive Hadoop Scala", 4),
      ("Hello Hive Hadoop", 3),
      ("Hello Hive", 2),
      ("Hello", 1)
    )
    val listString: List[String] = list.map(
      t => {
        (t._1 + " ") * t._2
      }
    )
    println(listString)
    println("------------------------------------")

    val strings: List[String] = listString.flatMap(_.split(" "))
    println(strings)
    println("------------------------------------")
    val midMap: Map[String, List[String]] = strings.groupBy(word => word)
    println(midMap)
    println("------------------------")
    val result: Map[String, Int] = midMap.map(
      t => {
        val key: String = t._1
        val sum: Int = t._2.size
        (key, sum)
      }
    )
    println(result)
  }
}
