package com.teacher.scala.day02.chapter03;

public class Scala02_Oper_Java {
    public static void main(String[] args) {

        // 等号的作用：赋值，将等号右边的计算结果赋值给等号的左边
//        int i = 0;
//        //int j = i++; // tmp = (i++) = 0, i = 1 =>  j = tmp = 0
//        i = i++;     // tmp = (i++) = 0 i= 1,    => i = tmp = 0
//
//        System.out.println("i = " + i );

        // 阶乘 ：一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        System.out.println(test(5));
    }
    // 阶乘
    // 马丁说：不要有歧义
    public static int test( int num ) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * test(num-1);
        }
    }
}
