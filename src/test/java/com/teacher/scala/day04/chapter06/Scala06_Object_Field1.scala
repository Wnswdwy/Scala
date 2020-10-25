package com.teacher.scala.day04.chapter06

import scala.beans.BeanProperty

object Scala06_Object_Field1 {

    def main(args: Array[String]): Unit = {

        // Bean规范
        // 类的属性应该同时提供公共的set, get方法
        /*

           private String name;
           public void setName()
           public String getName()

         */
        // 为了能够让声明的类的属性符合Bean规范，可以增加特殊的注解
        // 增加注解后，Scala编译时会自动添加符合bean规范的set，get方法
        val user = new User()
        user.username
//        user.setUsername()
//        user.getUsername

    }
    class User {
        @BeanProperty
        var username : String = _
    }

}