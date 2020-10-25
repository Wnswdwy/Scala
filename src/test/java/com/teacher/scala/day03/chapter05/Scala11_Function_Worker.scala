package com.teacher.scala.day03.chapter05

import java.io.ObjectInputStream
import java.net.{ServerSocket, Socket}

import com.teacher.scala.day01.bean.NewTask


object Scala11_Function_Worker {

    def main(args: Array[String]): Unit = {

        val server = new ServerSocket(9999)
        val master: Socket = server.accept()

        val objIn = new ObjectInputStream(master.getInputStream)
        val task: NewTask = objIn.readObject().asInstanceOf[NewTask]
        objIn.close()
        master.close()

        for ( i <- task.data ) {
            println(task.logic(i))
        }
        println("**** 计算完毕*****")
        server.close

    }

}
