package com.nswdwy.scala.chapter07_day06.review

import scala.collection.parallel.immutable.ParSeq
import scala.collection.{immutable, mutable}

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _8_Par {
    def main(args: Array[String]): Unit = {
        // TODO Par
        //单核并发
        val k1: immutable.IndexedSeq[String] = (1 to 100).map(ll => Thread.currentThread().getName)
        //多核并行（其中可能伴随并发）
        val k2: ParSeq[String] = ((1 to 100)).par.map(x => Thread.currentThread().getName)
        println(k1)
        println(k2)
    }

}
