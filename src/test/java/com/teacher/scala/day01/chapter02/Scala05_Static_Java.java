package com.teacher.scala.day01.chapter02;

import java.lang.reflect.Field;

public class Scala05_Static_Java {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();

        // 核心区别字体不一样。
        // sleep方法是静态方法，wait方法是成员方法
        Thread.sleep(1000);  // main线程休眠
        t2.wait();                 // t2线程等待
    }
}
