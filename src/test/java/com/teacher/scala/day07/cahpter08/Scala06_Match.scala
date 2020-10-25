package com.teacher.scala.day07.cahpter08

object Scala06_Match {

    def main(args: Array[String]): Unit = {

        // TODO 模式匹配 - 匹配对象
        val user = User("zhangsan", 30)
        //user.name ="lisi"

        // object => parameter (unapply)
        user match {
            case User("zhangsan", 30) => println("对象没有问题")
            case _ => println("对象不符合要求")
        }

    }

    // 马丁专门为模式匹配中的对象匹配创建了特殊的类：样例类，就是在class前增加case关键字
    // 这个类可以当成普通类来使用，也可以当成特殊类使用
    // 编译器在编译样例类时，会自动生成伴生对象，apply方法，unapply方法
    // 样例类默认会实现可序列化接口
    case class User(name: String, age: Int)
}
