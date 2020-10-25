package com.nswdwy.scala.chapter07_day06.practice

/**
 * @author yycstart
 * @create 2020-10-23 20:35
 */
object practice_functionGet {
  def main(args: Array[String]): Unit = {
    // TODO 今天晚上的练习 ： 两个Map的合并
    //        val map1 = Map("a"->1,"b"->2)
    //        val map2 = Map("a"->3,"c"->4)
    //        => Map("a"->4, "b"->2, "c"->4)
    //        xxxx.foldLeft(yyyy)(zzzz)

       val map1 = Map("a"->1,"b"->2) //("a",1),("b",2)
       val map2 = Map("a"->3,"c"->4) //("a",3),("c",4)

    val group1: Map[String, Map[String, Int]] = map1.groupBy(_._1)
    val group2: Map[String, Map[String, Int]] = map2.groupBy(_._1)
    println(group1)
    println(group2)
    println("-----------------")
    val list1: List[(String, Map[String, Int])] = group1.toList
    val list2: List[(String, Map[String, Int])] = group2.toList

    println(list1)
    println(list2)
    println("-----------------------")
    val allList: List[(String, Map[String, Int])] = list1 ::: list2 ::: Nil
    println(allList)
    println("------------------------")
//    val groupList: Map[String, List[(String, Map[String, Int])]] = allList.groupBy(_._1)
//    println(groupList)
    println("-------------------------")

    val midresult: List[(String, Int)] = allList.map(
      t => {
        val key: String = t._1
        val sum: Int = t._2.get(key).sum
        (key, sum)
      }
    )
    println(midresult)
    println("-------------------------")
    val groupMap: Map[String, List[(String, Int)]] = midresult.groupBy(_._1)
    println(groupMap)
    println("-------------------------")
    val result: Map[String, Int] = groupMap.map(
      t => {
        (t._1, t._2.map(_._2).sum)
      }
    )
    println(result)





  }
}
