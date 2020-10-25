package com.teacher.scala.day04.chapter06;

public class Scala07_Object_Access_Java {
    public static void main(String[] args) throws Exception {

        // 访问权限
        // 方法的提供者和调用者的关系
        // 方法提供者：com.atguigu.bigdata.scala.chapter06.A
        // 方法调用者：com.atguigu.bigdata.scala.chapter06.Scala07_Object_Access_Java

        // 点不是调用的意思，表示从属关系
        // 父子关系
        // super

        // 模板方法设计模式
        /*

           Parent{
              run {
                   step1
                   step2 ( abstract )
                   step3
              }

           }
           Child  extends Parent{

               step2 {

               }
           }
           Child1 extends Parent {
               step2 {

               }
           }



         */
        A a = new A();
        a.clone();
    }
}
class A{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
