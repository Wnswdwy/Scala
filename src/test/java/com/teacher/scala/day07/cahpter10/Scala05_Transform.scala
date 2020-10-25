package com.teacher.scala.day07.cahpter10


object Scala05_Transform extends Test with MyTrait {

    def main(args: Array[String]): Unit = {

        // 当前作用域
        // 父类(伴生对象)作用域
        // 特质（伴生对象）作用域
        // 包对象
        // 使用的时候直接导入即可
        import com.teacher.scala.day07.bean.TestTransform
        val user = new UserYYY()
        user.insertUser()
        user.updateUser()
    }
    // 隐式类
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
    class UserYYY {
        def updateUser(): Unit = ???

        def insertUser(): Unit = {
            println("insert user...")
        }
    }
}
class Test {

}
object Test {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
trait MyTrait {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}
object MyTrait {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user...")
//        }
//    }
}

