package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell4 {

    def main(args: Array[String]): Unit = {

        // TODO 将函数作为返回值来使用
        /*
          public User getUser() {
              User user = new User();

              return user;

          }
         */
        def test() = {
            def inner(): Unit = {
                println("xxxxxx")
            }
            inner _
        }
//        def test1():()=>Unit = {
//            def inner(): Unit = {
//
//            }
//            inner
//        }

//        val f = test()
//        f()
        test()()





    }
}
