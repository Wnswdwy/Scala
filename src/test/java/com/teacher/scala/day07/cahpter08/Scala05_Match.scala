package com.teacher.scala.day07.cahpter08

object Scala05_Match {

    def main(args: Array[String]): Unit = {

        // TODO 模式匹配 - 匹配对象
        // parameter => object (apply)
        val user = User("zhangsan", 30)

        // object => parameter (unapply)
        user match {
            case User("zhangsan", 20) => println("对象没有问题")
            case _ => println("对象不符合要求")
        }

    }
    // 类的构造方法中参数使用var或val声明
    // 那么这个参数就直接作为类的属性使用
    // var参数可以修改的，val参数不可以修改的。
    class User(var name: String, val age: Int)
    object User {
        def apply( name:String, age:Int ) = {
            new User(name, age)
        }

        def unapply(user: User): Option[(String, Int)] = {
            Option( (user.name, user.age) )
        }
    }
}
