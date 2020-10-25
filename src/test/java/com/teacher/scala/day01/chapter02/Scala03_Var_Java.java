package com.teacher.scala.day01.chapter02;

import java.lang.reflect.Field;

public class Scala03_Var_Java {
    public static void main(String[] args) throws Exception {

        String s = " a b "; // 5

//        s.trim(); // 3  trim去掉首尾半角空格
//        System.out.println("!"+s+"!");
        // ! a b !
        //String没有提供改变自身内容的方法
        // 反射
        final Class<String> stringClass = String.class;
        final Field value = stringClass.getDeclaredField("value");
        value.setAccessible(true);

        final char[] o = (char[])value.get(s);
        o[2] = 'D';

        System.out.println(s);
    }
}
