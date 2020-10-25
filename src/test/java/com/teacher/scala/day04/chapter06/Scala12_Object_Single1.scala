package com.teacher.scala.day04.chapter06


object Scala12_Object_Single1 {

    def main(args: Array[String]): Unit = {

        // 如果通过伴生对象的apply方法创建对象，那么编译器可以自动识别，所以apply方法名可以省略
        //println(User.apply())
        //println(User("zhangsan"))

        println(User) // => 获取的单例对象本身
        println(new User()) // => 通过构造方法创建的对象
        println(User())    // => 通过apply方法构造对象
    }
    // 伴生类
    //class User private() {
    class User() {

    }
    // 伴生对象
    // 可以访问伴生类中的松所有内容，包括私有的
    // 伴生对象一般使用apply方法创建伴生类对象
    // apply方法可以重载的
    object User {
//        def apply() = {
//            new User()
//        }
          def apply(): User = new User()
          def apply(name:String): User = new User()
    }
}