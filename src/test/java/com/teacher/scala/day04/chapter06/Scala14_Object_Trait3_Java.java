package com.teacher.scala.day04.chapter06;

public class Scala14_Object_Trait3_Java {
    public static void main(String[] args) {

        // 多态的传递
        A14 a = new C14();

        System.out.println(C14.class.getInterfaces().length);
        System.out.println(a);
    }
}

interface A14 {

}
class B14 {

}
class C14 extends B14 implements A14 {

}
