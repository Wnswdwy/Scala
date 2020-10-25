package com.teacher.scala.day01.chapter02

object Scala06_String {

    def main(args: Array[String]): Unit = {

        // Scala中没有字符串，它的字符串其实就是java的字符串
        val name : String = "zhangsan"

        // 字符串的拼接
        val email : String = "xxxxx"

        //println(" name ：" + name + ", email : " + email)
        // 传值字符串
        //printf(" name ：%s, email : %s", name, email)

        // 插值字符串
        //println("name : ${name}, email: ${email}")
        //println(s"name : ${name}, email: ${email}")

        // JSON 字符串
        // JSON => JavaScript Object Notation
        // 将符合JSON格式的字符串称之为JSON字符串
        // 插值字符串在JSON格式中会出现错误
//        println(s"{\"name\":\"${name}\"}")

        // 多行字符串 : JSON & SQL
        // 竖线称之为顶格符
        println(
            s"""
              {  "name" : "${name}" }
              | zhangsan
            """.stripMargin)

        println(
            """
              | select
              |    *
              | from user
              | where id = 1
            """.stripMargin)


    }
}
