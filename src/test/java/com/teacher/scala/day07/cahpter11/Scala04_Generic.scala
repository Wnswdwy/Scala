package com.teacher.scala.day07.cahpter11

object Scala04_Generic {

    def main(args: Array[String]): Unit = {

        //val c : Consumer[User] = new Consumer[User]
        //val c : Consumer[Child] = new Consumer[Child]
        //val data: User = c.consumer().data
        //println(data)

        val p : Producer[User] = new Producer[User]
       // p.produce( new Message[User]() )
        //p.produce( new Message[Parent]() )
        //p.produce( new Message[Child]() )

    }
    class Consumer[T] {
        // scala中泛型的上限采用是颜文字
        def consumer():Message[_ <: T] = {
            null
        }
    }
    class Producer[T] {
        // scala中泛型的下限采用是颜文字
        def produce( m : Message[ _ >: T ] ): Unit = {
        }
    }
    class Message[T] {
        var data : T = _
    }
}
