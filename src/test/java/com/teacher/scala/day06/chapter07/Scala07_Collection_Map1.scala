package com.teacher.scala.day06.chapter07

import scala.collection.mutable

object Scala07_Collection_Map1 {

    def main(args: Array[String]): Unit = {

        // TODO - 集合 - Map
        val map = mutable.Map("a"->1, "b"->2,"c"->3)

        val kiterator: Iterator[String] = map.keysIterator
        val keys: Iterable[String] = map.keys
        val set: collection.Set[String] = map.keySet

        map.values
        val viterator: Iterator[Int] = map.valuesIterator

        val kviterator: Iterator[(String, Int)] = map.iterator

    }
}
