package com.teacher.scala.day03.chapter06

object Scala01_Object {
    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程
        /*
        java : 面向对象编程

        package com.atguigu.test
        import java.util.*;

        public class User extends Person implements XXXX {

           private String name;
           public void setName( String name ) {
               this.name = name;
           }
           public String getName() {
              return this.name;
           }
        }

        User user = new User();
        user.setName("zhangsan")
        System.out.println(user.getName())
         */

        // 创建对象
        val user : User = new User()
        println(user.name)
        user.test()
    }
    // 声明类
    class User{
        // scala中类的属性其实就是变量
        val name : String = "zhangsan"

        // scala中类的方法其实就是函数
        def test(): Unit = {
            println("test....")
        }
    }

}
