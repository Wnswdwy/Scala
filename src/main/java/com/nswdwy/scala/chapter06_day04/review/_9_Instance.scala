package com.nswdwy.scala.chapter06_day04.review

import scala.beans.BeanProperty

/**
 * @author yycstart
 * @create 2020-10-21 18:48
 */
object _9_Instance {
  def main(args: Array[String]): Unit = {
    val user = new userInstance("lisi",12)
  }

  class userInstance(name:String) {  //主构造函数
    println("------")

    //辅助构造函数
    def this () = {
      this("zhangsan");
      println("=============")
    }
    def this(name:String,age:Int){
      this()
      println("xxxxxxxxxxxxx")

    }
  }
}
