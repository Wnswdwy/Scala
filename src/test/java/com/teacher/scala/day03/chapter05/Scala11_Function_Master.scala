package com.teacher.scala.day03.chapter05

import java.io.ObjectOutputStream
import java.net.Socket

import com.teacher.scala.day01.bean.NewTask



object Scala11_Function_Master {

    def main(args: Array[String]): Unit = {

        val worker = new Socket("localhost", 9999)

        val objOut = new ObjectOutputStream(worker.getOutputStream)

        val task = new NewTask()
        objOut.writeObject(task)
        objOut.flush()
        objOut.close()
        worker.close()

    }

}
