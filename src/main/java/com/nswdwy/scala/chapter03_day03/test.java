package com.nswdwy.scala.chapter03_day03;

/**
 * @author yycstart
 * @create 2020-10-20 11:34
 */
public class test {
    public static void main(String[] args) {
        int t = te(12);
        System.out.println(t);

    }
    public static  int tl(int y){
        return y;
    }
    public static int te(int x){
        int s = x + tl(12);
        return s;
    }
}
