package com.teacher.scala.day06.chapter08

object Scala02_Match {

    def main(args: Array[String]): Unit = {

        // TODO 模式匹配 - 匹配常量
        def describe(x: Any) = {
            x match {
                case 5 => "Int five"
                case "hello" => "String hello"
                case true => "Boolean true"
                case '+' => "Char +"
            }
        }

        // TODO 模式匹配 - 匹配类型
        // 模式匹配中，类型的匹配其实是不考虑泛型的。
        // 因为泛型和类型不是一回事。
        // 数组类型是特殊情况，需要考虑泛型
        def describe1(x: Any) = {
            x match {
                case i: Int => "Int"
                case s: String => "String hello"
                case m: List[Int] => "List"
                case c: Array[Int] => "Array[Int]"
                case someThing => "something else " + someThing
            }
        }

        //println(describe1(List("1","2","3")))
        // int[]
        println(describe1(Array("1","2","3")))
    }
}
