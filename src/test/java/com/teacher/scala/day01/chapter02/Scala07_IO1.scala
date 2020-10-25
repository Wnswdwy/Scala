package com.teacher.scala.day01.chapter02

import java.io.{FileWriter, PrintWriter}

import scala.io.{BufferedSource, Source}

object Scala07_IO1 {

    def main(args: Array[String]): Unit = {

        // 装饰者设计模式
        val out = new PrintWriter(new FileWriter("output/test.txt"))
        out.println("zhangsan")
        out.println("lisi")
        out.flush()
        out.close()
    }
}
