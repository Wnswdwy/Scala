package com.teacher.scala.day06.chapter07;

public class Scala11_Collect_ThreadSafe {
    public static void main(String[] args) {

        User11 user = new User11();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "zhangsan";
                try {
                    Thread.sleep(1000);
                } catch ( Exception e ) {
                    e.printStackTrace();
                }
                System.out.println(user.name);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "lisi";
                try {
                    Thread.sleep(1000);
                } catch ( Exception e ) {
                    e.printStackTrace();
                }
                System.out.println(user.name);
            }
        });

        t1.start();
        t2.start();

        System.out.println("main方法执行完毕");

        // main
        // zhangsan(lisi)
        // list(zhangsan)

    }

}
class User11 {
    public String name;
}
