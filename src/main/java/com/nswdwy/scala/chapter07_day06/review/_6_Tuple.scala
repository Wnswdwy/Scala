package com.nswdwy.scala.chapter07_day06.review

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _6_Tuple {
    def main(args: Array[String]): Unit = {
        // TODO Tuple

        val tuple: (Int, String, Double) = (1, "name", 1.0)
        val arity: Int = tuple.productArity
        println("--1---"+arity)
        println("-------------------------")
        val value: Any = tuple.productElement(1)
        println("2____"+value)
        println("-------------------------------")

        val iterator: Iterator[Any] = tuple.productIterator
        println(iterator+"---")
        while (iterator.hasNext){
            println(iterator.next()+ ">>")
        }

    }

}
