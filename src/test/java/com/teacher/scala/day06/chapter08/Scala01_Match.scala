package com.teacher.scala.day06.chapter08

object Scala01_Match {

    def main(args: Array[String]): Unit = {

        val age = 20

        // 模式匹配使用match语法
        // 按照case顺序进行匹配
        // 如果匹配成功，那么执行箭头右边的代码，执行完毕后，会自动切断匹配
        // 如果都匹配不成功，那么执行下划线的分支。
        // 如果所有的分支都没有匹配成功，会发生错误
        age match {
            case _  => println("其他")
            case 10 => {
                println("年龄为10")
            }
            case 20 => println("年龄为20")
            case 30 => println("年龄为30")
            //case _  => println("其他")
        }

    }
}
