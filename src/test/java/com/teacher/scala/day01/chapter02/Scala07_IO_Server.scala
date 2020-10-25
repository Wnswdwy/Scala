package com.teacher.scala.day01.chapter02

import java.io.{FileWriter, InputStream, ObjectInputStream, PrintWriter}
import java.net.{ServerSocket, Socket}

import com.teacher.scala.day01.bean.Task


object Scala07_IO_Server {

    def main(args: Array[String]): Unit = {

        var server = new ServerSocket(9999)
        println("服务器启动，等待连接")

        val client: Socket = server.accept()
        println("客户端已经链接成功")

        //val stream: InputStream = client.getInputStream
        //val i: Int = stream.read()
        //println("获取客户端传递的值 ： " + i)

        val objIn = new ObjectInputStream(client.getInputStream)
        val task = objIn.readObject().asInstanceOf[Task]
        println("客户端发送的数据为 ： " + task.data)

        client.close()
        server.close()
    }
}
