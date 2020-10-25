package com.teacher.scala.day04.bean;

public class AAA {
    private String name = "zhangsan";

    private String age;

    public void setAge( String age ) {
        this.age = age;
        name = age.substring(0,1);
    }
    public String getAge() {
        return this.age;
    }
}
