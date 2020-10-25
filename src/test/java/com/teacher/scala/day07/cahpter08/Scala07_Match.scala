package com.teacher.scala.day07.cahpter08

object Scala07_Match {

    def main(args: Array[String]): Unit = {

        // 匹配变量
//        val ( id, name, age ) = (1, "zhangsan", 30)
//
//        println(name)

        //println(t._2)
//        val list = List(
//            ("1-zhangsan", 30)
//        )
//        list.map(
//            t => {
//                val k = t._1
//                val v = t._2
//                val ks = k.split("-")
//                ( ks(0), (ks(1), v) )
//            }
//        )

//        val list = List(
//            ((1,"zhangsan"), 30)
//        )
//        list.map(
//            t => {
//                ( t._1._1, ( t._1._2, t._2 ) )
//            }
//        )

        val map = Map(("a", 1), ("b", 2))

        for ( ( k, 2 ) <- map ) {
            println( k )
        }
    }

}
