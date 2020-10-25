package com.nswdwy.scala.chapter07_day06.review

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _5_Map {
    def main(args: Array[String]): Unit = {
        // TODO Map
        val map: Map[String, Any] = Map(("name", "zhangsan"), ("id", 1), "age" -> 19, "email" -> "zhang@")
        val values: Iterable[Any] = map.values
        println("values--"+values)
        println("--------------------------")
        val iterator: Iterator[Any] = map.valuesIterator
        while (iterator.hasNext){
            println("iterator--"+iterator.next())
        }
        println("--------------------------")
        val option: Option[Any] = map.get("name")
        println("option--"+option)
        println("----------------------------------")
        val value: Any = map.getOrElse("name", "10")
        println("value--"+value)
        println("---------------------------------")
        val option1: Option[Any] = map.get("13")
        val option2: Option[Any] = map.get("name")
        println("--option1--"+option1)
        println("--option2--"+option2)
        println("-------------------------------------")
        val value1: Any = option1.getOrElse(0)
        val value2: Any = option2.getOrElse(11)
        println("--value1--"+value1)
        println("--value2--"+value2)
    }

}
