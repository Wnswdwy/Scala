package com.teacher.scala.day04.chapter06;
import java.lang.reflect.Field;

import static com.teacher.scala.day04.bean.Student.id;
import static com.teacher.scala.day04.bean.Student.reg;

public class Scala03_Object_Import_Java {
    public static void main(String[] args) throws Exception{

        reg();
        System.out.println(id);

        Class c = String.class;
        Field f= String.class.getDeclaredField("value");
        final String name = f.getName();
        // username
        String setMethodName = "set" + name.substring(0,1).toUpperCase() + name.substring(1);
        // setUsername
        //c.getMethod(setMethodName)
    }
}
