package com.nswdwy.scala.chapter03_day03

/**
 * @author yycstart
 * @create 2020-10-20 18:35
 */
object Function_Hell2 {
  def main(args: Array[String]): Unit = {

    // TODO 将函数作为参数进行传递
    def f(s:String)= {
      s * 2
    }
    def test(f:String=>String)=f("zhangsan")
    val s2 = f _
    println(test(s2))
    println("--------------")
    //完整写法
    println(test((s: String) => {s * 2}))
    println(test((s: String) => s * 2))
    println("---------------------------------")
    println(test(s => s * 2))
    println("----------------------------------")
    def test00( name : String, f: (String)=> String ):Unit = {
            println(f(name))
        }
    test00("lisi",_ * 2)


  }
}
