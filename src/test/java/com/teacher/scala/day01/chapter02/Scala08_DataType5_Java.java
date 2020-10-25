package com.teacher.scala.day01.chapter02;

public class Scala08_DataType5_Java {
    public static void main(String[] args) throws Exception {

        A a = new B();
        test(a);
    }
    public static void test( A a ) {
        System.out.println("aaaa");
    }
    public static void test( B b ) {
        System.out.println("bbbb");
    }
}
class A {

}
class B extends A {

}
