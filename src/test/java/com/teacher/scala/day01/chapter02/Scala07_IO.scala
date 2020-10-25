package com.teacher.scala.day01.chapter02

import scala.io.{BufferedSource, Source}

object Scala07_IO {

    def main(args: Array[String]): Unit = {

        // 从控制台输入内容
//        val line = scala.io.StdIn.readLine()
//        println("line = " + line)

        // 从文件中获取输入
        // fromFile可以传递一个参数，这个参数其实是一个路径
//         绝对路径：不可改变的路径
//               本地路径 : file:///D:/
//               网络路径：协议:IP:PORT/xxxxx/yyyy/zzzz

        // 相对路径：可以改变的路径, 需要一个基准路径
        //      ../   ./

        // 如果想要从IDEA中读取文件，那么需要使用相对路径
        // 这里相对路径的基准路径时IDEA中Project的根路径
        val source: BufferedSource = Source.fromFile("input/word.txt")

        val strings: Iterator[String] = source.getLines()
        while (strings.hasNext) {
            println(strings.next())
        }

        source.close()
    }
}
