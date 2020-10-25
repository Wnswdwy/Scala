package com.teacher.scala.day01.chapter02;

public class Scala08_DataType3_Java {
    public static void main(String[] args) throws Exception {

        byte b = 127;
        b++; // java 一元运算符不会提升数据类型

        // （byte）(127 + 1) = -128

        // 0111 1111
        //         1
        //----------
        // 0000 0000 0000 0000 0000 0000 1000 0000
        //                               1000 0000

        // 1 + 1111111    => 负数 + 7位最大值 => 8位中负数最大值 => -1
        // 1 + 000 0000   => 负数 + 7位最小值 => 8位中负数最小值 => -128


        // 127
        // -128
        // 128
        System.out.println(b);

        //b = (byte)i;



    }
}
