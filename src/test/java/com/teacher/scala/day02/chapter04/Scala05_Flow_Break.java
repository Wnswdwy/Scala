package com.teacher.scala.day02.chapter04;

public class Scala05_Flow_Break {
    public static void main(String[] args) {

        for ( int i = 1; i <= 10; i++ ) {
            if ( i % 2 == 0 ) {
                // Scala中没有break关键字
                break;
                // Scala中没有continue关键字
                //continue;
            }
            System.out.println(i);
        }
        System.out.println("继续执行。。。");

    }
}
