package com.teacher.scala.day04.chapter06;

public class Scala08_Object_Method_Java {
    public static void main(String[] args) {

//        AAA08 a = new AAA08();
//        System.out.println(a.sum()); // 20

//        BBB08 a = new BBB08();
//        System.out.println(a.sum()); // 40

        // 父类和子类同时存在相同的方法，存在方法的重写，JVM为了能够区分方法，采用特殊的处理机制
        // 动态绑定机制：在程序运行时，调用对象的成员方法时，会将方法和当前对象的实际内存进行绑定，然后调用。
        // 属性没有动态绑定机制，在哪里声明在哪里使用
//        AAA08 a = new BBB08();
//        System.out.println(a.sum()); // 40

        AAA08 a = new BBB08();
        System.out.println(a.sum()); // 20
    }
}
class AAA08 {
    public int i = 10;
    public int sum() {
        return getI() + 10;
    }
    public int getI() {
        return i;
    }
}
class BBB08 extends AAA08 {
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
}
