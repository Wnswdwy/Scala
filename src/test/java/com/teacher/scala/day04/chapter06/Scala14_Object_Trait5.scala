package com.teacher.scala.day04.chapter06

object Scala14_Object_Trait5 {

    def main(args: Array[String]): Unit = {

        val mysql = new MySQL
        // 特质的功能叠加
        // 多个特质中相同的功能可以叠加在一起，但是执行顺序为从右向左
        // 也可以根据实际情况跳过某一个功能
        mysql.operData()

    }
    trait Operator {
        def operData(): Unit = {
            println("操作数据")
        }
    }
    trait DB extends Operator {
        override def operData(): Unit = {
            print("向数据库中")
            super[Operator].operData()
        }
    }
    trait File extends Operator {
        override def operData(): Unit = {
            print("向文件中")
            // super表示的不是父类（特质），表示上一个特质
            super.operData()
        }
    }
    class MySQL extends File with DB{

    }
}