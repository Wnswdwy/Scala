package com.teacher.scala.day07.cahpter11;

public class Scala02_Generic_Java {
    public static void main(String[] args) {

        Consumer c = new Consumer();
        // 获取的数据一定要满足某些功能
        // 泛型的上限一般是用于保证数据的功能不缺失
        final Message<? extends User> consume = c.consume();
        final User data = consume.data;

        // 泛型的下限一般用于保证数据不进行扩展
        new Producer().produce( new Message<User>() );
        new Producer().produce( new Message<Parent>() );
        //new Producer().produce( new Message<Child>() );（X）
    }
}
class Message<T> {
    public T data;
}
class Consumer {
    public Message<? extends User> consume() {
        return null;
    }
}
class Producer {
    public void produce( Message<? super User> m ) {

    }
}
