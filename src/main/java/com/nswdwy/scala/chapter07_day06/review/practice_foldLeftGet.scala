package com.nswdwy.scala.chapter07_day06.review

/**
 * @author yycstart
 * @create 2020-10-23 20:35
 */
object practice_foldLeftGet {
  def main(args: Array[String]): Unit = {
    // TODO 今天晚上的练习 ： 两个Map的合并
    //        val map1 = Map("a"->1,"b"->2)
    //        val map2 = Map("a"->3,"c"->4)
    //        => Map("a"->4, "b"->2, "c"->4)
    //        xxxx.foldLeft(yyyy)(zzzz)

       val map1 = Map("a"->1,"b"->2) //("a",1),("b",2)
       val map2 = Map("a"->3,"c"->4) //("a",3),("c",4)

    val list1: List[(String, Int)] = map1.toList
    val list2: List[(String, Int)] = map2.toList
//      val combineMap: Map[String, Int] = map1.++(map2)
//      println(combineMap)

    val comList: List[(String, Int)] = list1.++(list2)
    println(comList)
    val mid: Map[String, List[(String, Int)]] = comList.groupBy(_._1)
    println(mid)
    val result: Map[String, Int] = mid.map(
      t => {
        (t._1, t._2.map(_._2).sum)
      }
    )
    println(result)


  }
}
