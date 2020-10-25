package com.nswdwy.scala.chapter06_day04.review;


/**
 * @author yycstart
 * @create 2020-10-21 20:22
 */
public class _8_Method {
    public static void main(String[] args) {
        methodA m = new methodB();
        m.fun();
        System.out.println("-----------------");
        methodC m2 = new methodD();
        m2.fun();
        System.out.println("-----------------");
        methodE m3 = new methodF();
        m3.fun();
        System.out.println("-----------------");
        methodG m4 = new methodH();
        m4.fun();
    }
}
class methodA{
    int age = 12;
    public void fun(){
        System.out.println("A_age:" + age);
    }
}
class methodB extends methodA{
    int age = 22;
    public void fun(){
        System.out.println("B_age:" + age);
    }
}
class methodC{
    String name = "zhangsan";
    public void fun(){
        System.out.println("C_name:" + name);
    }
}
class methodD extends methodC{
    String name = "lisi";
}

class methodE{
    int id = 12;
    public void fun(){
        System.out.println("E_id:" + (getId()+1.0) );//会调用加载类本身的方法
    }
    public int getId(){
        return id;
    }
}
class methodF extends methodE{
    int id = 22;
    public int getId(){
        return id;
    }
}
class methodG{
    int id = 12;
    public void fun(){
        System.out.println("E_id:" + (getId()+1.0) );//会调用加载类本身的方法
    }
    public int getId(){
        return id;
    }
}
class methodH extends methodG{
    int id = 22;
}