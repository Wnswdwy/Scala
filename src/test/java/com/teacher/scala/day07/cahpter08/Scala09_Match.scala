package com.teacher.scala.day07.cahpter08

object Scala09_Match {

    def main(args: Array[String]): Unit = {

//        val list = List(
//            ("a", 1), ("b", 2), ("c", 3)
//        )

//        println(list.toMap.mapValues(
//            cnt => cnt * 2
//        ).toList)

//        def fun( t : (String,Int) ): (String, Int) = {
//            (t._1, t._2 * 2)
//        }
//
//        list.map(fun)

//        println(list.map{
//            case (word, count) => {
//                (word, count * 2)
//            }
//        })

//        val list = List(
//            ((1, "zhangsan"), 30)
//        )
//
//        println(list.map{
//            case ( (prv, item), cnt ) => {
//                ( prv, (item, cnt) )
//            }
//        })

        val list = List(
            ("a", 1), ("b", 1), ("c", 2)
        )

        val result = list.filter{
            case (_, cnt) => {
                cnt % 2 == 1
            }
        }

        list.groupBy{
            case ( _, cnt ) => {
                cnt
            }
        }
        println(result)

    }

}
