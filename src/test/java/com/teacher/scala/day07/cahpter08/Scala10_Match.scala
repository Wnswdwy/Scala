package com.teacher.scala.day07.cahpter08

object Scala10_Match {

    def main(args: Array[String]): Unit = {
        // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串
        val list : List[Any] = List(1,2,3,4,5,6,"test")

        // 改变需求
        //println(list.filter(d => d.isInstanceOf[Int]).map(d => d.asInstanceOf[Int] + 1))
//        val result = list.map(
//            data => {
//                data match {
//                    case i : Int => i + 1
//                    case d => d
//                }
//            }
//        ).filter(d=>d.isInstanceOf[Int])

        // 采集数据, 符合条件的数据会被采集并做处理
        // 这样的函数称之为偏（部分）函数
        // 一般情况下，偏函数就是使用case的模式匹配
        val result = list.collect{
            case i : Int => i + 1
        }

        println(result)


    }

}
