package com.teacher.scala.day06.chapter07;

public class Scala07_Collect_Map_Java {
    public static void main(String[] args) {

        // 调用了一个为空对象的成员属性或成员方法

        // NullPointerException
        //User07 user = null;
        //test(user.age); // 拆箱原理 ： Integer.intValue

        Integer i1 = 200; // 装箱原理 ： Integer.valueOf
        Integer i2 = 200;
        System.out.println(i1 == i2);
    }
    public static void test( int age ) {
        System.out.println(age);
    }

}
class User07 {
    public static Integer age;
}
