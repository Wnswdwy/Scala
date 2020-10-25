package com.nswdwy.scala.chapter07_day06.review

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _5_Map1 {
    def main(args: Array[String]): Unit = {
        // TODO Map
        val map: Map[String, Any] = Map(("name", "zhangsan"), ("id", 1), "age" -> 19, "email" -> "zhang@")
        val keys: Iterable[String] = map.keys
        println("1-----------"+keys)
        println("----------------------------------------")
        println("2--map.keySet---"+map.keySet)
        println("----------------------------------------")
        val iterator: Iterator[String] = map.keysIterator
        while (iterator.hasNext){
            println("3------"+iterator.next())
        }
        println("----------------------------------------")

    }

}
