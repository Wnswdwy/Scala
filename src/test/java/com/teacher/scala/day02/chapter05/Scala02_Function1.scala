package com.teacher.scala.day02.chapter05

object Scala02_Function1 {

    def main(args: Array[String]): Unit = {

        // 25
        def test(
                i1:Int,
                i2:Int,
                i3:Int,
                i4:Int,
                i5:Int,
                i6:Int,
                i7:Int,
                i8:Int,
                i9:Int,
                i10:Int,
                i11:Int,
                i12:Int,
                i13:Int,
                i14:Int,
                i15:Int,
                i16:Int,
                i17:Int,
                i18:Int,
                i19:Int,
                i20:Int,
                i21:Int,
                i22:Int,
                i23:Int,
                i24:Int,
                i25:Int
                ): Unit = {
            println("xxxxx")
        }

        test(
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1
        )

        // 在将函数作为对象传递给别人使用的时候，那么函数的参数最多只能22个
        // 函数类型, 参数最多只能为Function22
        // Scala说完全面向对象语言 ： 函数也是对象
        //
        //val a : Function23 = test _
        //val u : User = new User()

    }
}
