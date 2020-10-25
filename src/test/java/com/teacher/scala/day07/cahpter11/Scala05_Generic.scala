package com.teacher.scala.day07.cahpter11

object Scala05_Generic {

    def main(args: Array[String]): Unit = {
        // 上下文限定和隐式转换有关系
//        def f[A : Test](a: A) = println(a)
//        implicit val test : Test[Child] = new Test[Child]
//        f( new Child() )

        //val list = List(1,2,3,4)

        // Int, Int => Int
        //val i: Int = list.reduce(_+_)
        //list.reduceLeft()
        //println(i)

        val users: List[User] = List(
            new User(), new User()
        )
//        val child: Child = users.reduce[Child](
//            (x, y) => x
//        )
        val p: Parent = users.reduce[Parent](
            (x, y) => x
        )
        println(p)

    }
}
