package com.nswdwy.scala.chapter06_day04.review

/**
 * @author yycstart
 * @create 2020-10-21 18:48
 */
object _10_Extends {
  def main(args: Array[String]): Unit = {
    println("<<<<<<<<<<<first-childExtends()<<<<<<<<<<<<<<<<<<<<<<<<")
    val child1 = new childExtends();
    println("<<<<<<<<<<<second-childExtends(\"xxxx\")<<<<<<<<<<<<<<<<<<<<<<<<")
    val child2 = new childExtends("xxxx");
    println("<<<<<<<<<<<<third-child2Extends()<<<<<<<<<<<<<<<<<<<<<<<")
    /**
     * TODO 继承有参数，创建对象无参数,先走辅助构造函数，this(),它会调用主构造函数this(name),将name传递给父类
     */
    val child3 = new child2Extends();
    println("<<<<<<<<<<<<<forty-child2Extends(\"xxxx\")<<<<<<<<<<<<<<<<<<<<<<")
    val child4 = new child2Extends("xxxx");

  }

  class parentExtends(name:String)  {
    println("name=>"+name)
    println("--------1---------")
    //辅助构造函数
    def this () {
      this("zhangsan");
      println("--------2---------")
      println("this.name=>"+name)
    }
    println("--------3---------")
  }

  class childExtends(name:String) extends  parentExtends { //主构造函数
    println("=====111=======")
    def this() {
      this("lisi")
      println("=====222=======")
    }
    println("=====333=======")
  }
  //TODO 问：继承有参数，创建对象无参数,先走辅助构造函数，this(),它会调用主构造函数this(name),将name传递给父类
  class child2Extends(name:String) extends  parentExtends(name) { //主构造函数
    println("//////111")
    def this() {
      this("lisi")
      println("//////222")
    }
    println("//////333")
  }
}
