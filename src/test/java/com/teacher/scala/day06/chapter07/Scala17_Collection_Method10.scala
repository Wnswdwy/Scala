package com.teacher.scala.day06.chapter07

object Scala17_Collection_Method10 {

    def main(args: Array[String]): Unit = {

        val user1 = new User()
        user1.id = 1
        user1.age = 25

        val user2 = new User()
        user2.id = 2
        user2.age = 30

        val user3 = new User()
        user3.id = 2
        user3.age = 16

       val list = List(
           user1, user2, user3
       )

        //println(list.sortBy(_.id)(Ordering.Int.reverse))
        // 自定义排序
        println(list.sortWith(
            (left, right) => {
                // 排序方式满足预期返回true, 否则返回false
                if (left.id  < right.id) {
                    true
                } else if ( left.id == right.id ) {
                    left.age > right.age
                } else {
                    false
                }
            }
        ))

    }
    class User {
        var id : Int = _
        var age : Int = _

        override def toString: String = {
            s"User[${id}, ${age}]"
        }
    }
}
