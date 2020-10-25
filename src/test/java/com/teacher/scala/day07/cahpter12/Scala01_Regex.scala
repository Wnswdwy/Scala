package com.teacher.scala.day07.cahpter12

import scala.util.matching.Regex

object Scala01_Regex {

    def main(args: Array[String]): Unit = {

        // 正则表达式
        // 模式匹配用于匹配数据的规则
        // 正则表达式也是一种匹配，只针对于字符串

        // 定义规则
//        val r: Regex = "a{2}".r
//
//        val s : String = "acaa"
//
//        val maybeString: Option[String] = r.findFirstIn(s)
//        if ( maybeString.isEmpty ) {
//            println("字符串不符合规则")
//        } else {
//            println("字符串符合规则 :" + maybeString.get)
//        }

        val pattern1 = new Regex("(S|x)cala")
        val str1 = "Scala is scalable Language"
        println((pattern1 findAllIn str1).mkString(","))
    }
}
