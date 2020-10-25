package com.teacher.scala.day04.chapter06

object Scala15_Object {

    def main(args: Array[String]): Unit = {

        val c: Class[User] = classOf[User]

    }
    class User {
        var id : Int = _
        override def equals(obj: Any): Boolean = {
            if ( obj.isInstanceOf[User] ) {
                val otherUser = obj.asInstanceOf[User]
                otherUser.id == this.id
            } else {
                false
            }
        }
    }
}