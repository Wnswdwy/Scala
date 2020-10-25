package com.teacher.scala.day07.cahpter11;

import java.util.*;
public class Scala01_Generic_Java {
    public static void main(String[] args) {

        // TODO 泛型和类型是两个截然不同的概念，也是两个不同层面的操作
        // 泛型向后约束，无法向前约束

        // 泛型其实是对外部类型的内部数据的类型进行约束
//        List list = new ArrayList();
//        list.add(new Emp());
//
//        List<User> users = list;
//
//        for ( User user: users ) {
//            System.out.println(user);
//        }
        // TODO 泛型和类型无关
        // 泛型不可变
        //Test<User> userTest = new Test<User>();
        //Test<User> userTest1 = new Test<Parent>();
        //Test<User> userTest2 = new Test<Child>();
        //List<String> wordList = new ArrayList<String>();
        //test(wordList);

        // TODO 泛型的上限和下限
        test( User.class );
        //test( Parent.class ); // Error
        test( Child.class );

        test1( User.class );
        test1( Parent.class );
        //test1( Child.class ); // Error

    }
    // 上限 : extends
    public static void test(Class<? extends User> c) {

    }
    // 下限：super
    public static void test1(Class<? super User> c) {

    }
//    public static void test( Collection<String> sss ) {
//    }
//    public static void test( List<Object> objs ) {
//        System.out.println("test....");
//    }
}
class Test<T> {

}
class Parent {

}
class User extends Parent {

}
class Child extends User {

}
