package com.teacher.scala.day07.cahpter11

object Scala03_Generic {

    def main(args: Array[String]): Unit = {

        // Scala中的泛型采用的是中括号声明
        // 泛型不可变
        val ttt1 : TTT[B] = new TTT[B]()
        //val ttt2 : TTT[B] = new TTT[A]()
        //val ttt3 : TTT[B] = new TTT[C]()

        // Scala希望将类型和泛型当成一个整体来使用
        // 这个整体的类型就存在上下级关系
        //  如果 TTT[父类型]，那么TTT[子类型]就是TTT[父类型] 的子类
        // 这种变化称之为泛型的协变 ：在泛型前增加特殊符号，+
        // TODO class TTT[+T]
        // val ttt3 : TTT[B] = new TTT[C]() (ok)
        //val ttt2 : TTT[B] = new TTT[A]() （X）
        // 还有一种情况，TTT[父类型]反过来当成TTT[子类型]的子类型
        // 这种变化称之为泛型的逆变 ：在泛型前增加特殊符号，-
        // TODO class TTT[-T]
        //val ttt2 : TTT[B] = new TTT[A]()// (Ok)
        //val ttt3 : TTT[B] = new TTT[C]() (X)

    }
}
class TTT[-T] {

}
class A {

}
class B extends A {

}
class C extends B{

}
