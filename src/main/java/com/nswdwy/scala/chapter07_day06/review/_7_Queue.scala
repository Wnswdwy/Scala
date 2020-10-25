package com.nswdwy.scala.chapter07_day06.review

import scala.collection.mutable

/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _7_Queue {
    def main(args: Array[String]): Unit = {
        // TODO Queue
        val que: mutable.Queue[Int] = new mutable.Queue[Int]()
        que.enqueue(1, 3, 2, 6, 5, 4, 7, 8, 9)
        println("sss------------>"+que)
        println("bbb--------"+que.dequeue())
        //出队列
        println("bbb--------"+que.dequeue())
        //向队列中添加（入对）
        que.enqueue(111)
        // 先进先出，
        println(que)
    }

}
