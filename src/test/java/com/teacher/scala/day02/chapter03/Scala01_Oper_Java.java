package com.teacher.scala.day02.chapter03;

public class Scala01_Oper_Java {
    public static void main(String[] args) {

        String s1 = null;
        String s2 = "abc";
        String s3 = new String("abc");

        // Scala比较对象的内容，推荐使用双等号
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//
//        System.out.println(s1.eq());

    }
}
