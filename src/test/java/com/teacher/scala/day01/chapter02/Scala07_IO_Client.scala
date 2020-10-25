package com.teacher.scala.day01.chapter02

import java.io.{FileWriter, ObjectOutputStream, OutputStream, PrintWriter}
import java.net.Socket

import com.teacher.scala.day01.bean.Task



object Scala07_IO_Client {

    def main(args: Array[String]): Unit = {

        // 建立和服务器的连接
        val client = new Socket("localhost", 9999)


        // 发送普通数据
        //val stream: OutputStream = client.getOutputStream
        //stream.write(10)

        // 发送对象
        val task : Task = new Task()
        task.data = "zhangsan,lisi,wangwu"

        // 对象输出流
        val objOut = new ObjectOutputStream(client.getOutputStream)
        objOut.writeObject(task)
        objOut.flush()
        objOut.close()


        println("向服务器发送对象")
        client.close()
    }
}
