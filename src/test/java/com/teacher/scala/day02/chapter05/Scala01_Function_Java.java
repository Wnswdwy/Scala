package com.teacher.scala.day02.chapter05;

public class Scala01_Function_Java {
    public static void main(String[] args) {

        System.out.println(upperFirst("test"));
    }
    public static String upperFirst( String s ) {
        return s.substring(0,1).toUpperCase();
    }
}
