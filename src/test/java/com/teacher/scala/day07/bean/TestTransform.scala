package com.teacher.scala.day07.bean

import com.teacher.scala.day07.cahpter10.Scala05_Transform.UserYYY

object TestTransform {
    implicit class UserExt(user:UserYYY) {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
}
