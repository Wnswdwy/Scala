package com.nswdwy.scala.chapter06_day04.review

import scala.beans.BeanProperty

/**
 * @author yycstart
 * @create 2020-10-21 18:48
 */
object _3_FieldTest {
  def main(args: Array[String]): Unit = {

    val user : userField = new userField()
    println(user.s2)
    user.s2 = "zhangsan"
    println(user.s2)
    println("----------")
    println(user.s3)
    user.s3 = 12
    println(user.s3)
  }

  class userField{
//    val s1 : String = _  //val定义的变量不能用 _ ,来默认初始化
    var s2 : String = _
    @BeanProperty
    var s3 : Int = _
  }
}
