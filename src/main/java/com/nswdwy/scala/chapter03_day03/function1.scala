package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 9:43
 */
object function1 {
  def main(args: Array[String]): Unit = {
    //
    def test01(): String ={
      "zhangsan"
    }
    val s1 = test01
    val s1_2 = test01 _
    val s1_3 = test01()
    val s1_4 :()=>String = test01
    val s1_5 :()=>String = test01 _
    println(s1)  //zhangsan
    println(s1_2) //com.nswdwy.scala.chapter03.function1$$$Lambda$1/142257191@17d99928
    println(s1_3)  //zhangsan
    println(s1_4)  //com.nswdwy.scala.chapter03.function1$$$Lambda$2/245257410@2b80d80f
    println(s1_5)  //com.nswdwy.scala.chapter03.function1$$$Lambda$3/455659002@3ab39c39

    println("----------------------------------")
    def test02(name : String): Unit ={
      println(name)
    }
    val s2 = test02("lisi")
//    val s2_2 :(String)=>() = test02("lisi")  //false

    println("------------------------------------")

    def test03(name : String): String ={
      name
    }

    val s3 = test03("test03")
    /**
     * Error:(38, 41) _ must follow method; cannot follow String
     * val s3_2:(String) => String = test03("test03_2..") _ //报错
     */
//    val s3_2:(String) => String = test03("test03_2..") _ //报错

    println(s3)
//    print(s3_2)
    println("------------------------------------")

    def  test04(name:String,password:String): String ={
        name + "," + password
    }
    val s4 = test04("zhangsan","123321")
    /**
     * Error:(48, 46) type mismatch;
     * found   : String
     * required: (String, String) => String
     * val s4_2:(String,String)=>String = test04("zhangsan","123321") //
     */
//    val s4_2:(String,String)=>String = test04("zhangsan","123321") //
    val s4_3 = test04("zhangsan","123321")
    println(s4)
//    println(s4_2)
    println(s4_3)
  }
}
