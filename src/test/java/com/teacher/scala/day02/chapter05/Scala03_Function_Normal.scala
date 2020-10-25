package com.teacher.scala.day02.chapter05

object Scala03_Function_Normal {

    def main(args: Array[String]): Unit = {

        // TODO 可变参数
        // 传递多个含义相同的参数，但是个数不确定。
        def f1( name:String, name1:String, name2:String ): Unit = {

        }
       // f1()
        //f1("zhangsan", "lisi", "wangwu")
        // 函数在调用传参时，第一个值会和第一个参数进行绑定，第二值会和第二个参数绑定，依此类推
        // 如果参数的含义是相同的，但是个数不确定的场合，可以采用可变参数
        // Java中存在可变参数，但是和Scala的语法不一样。scala采用的是星号
        // 可变 参数在使用时就是当成集合来使用
        def f2( name:String* ): Unit = {
            println(name)
        }

        // 可变参数不考虑类型，必须放置在参数列表的最后
        // 参数列表中最多只能存在一个可变参数，而且必须放置在最后
//        def f22( name:String*, password:Int ): Unit = {
//
//        }

        //f2() // => 空集合： List()
        //f2("zhangsan") // => WrappedArray(zhangsan)
        //f2("zhangsan", "lisi") // => WrappedArray(zhangsan, lisi)

        // 函数的参数是无法改变的，就类似于使用val声明的变量
//        def f3( password : String ): Unit = {
//            var pswd = password
//            if ( pswd == null ) {
//                pswd = "123123"
//            }
//            println("密码为：" + pswd)
//        }
        //f3(null)

        // TODO 参数默认值
        // 为了解决参数默认值以及参数无法改变的问题，scala提供了参数的默认值
        // 当调用函数时，如果不传递这个参数，那么默认值就起作用
        //               如果从传递这个参数，那么默认值就不起作用了。
//        def f4( password :String = "123123" ): Unit = {
//            println(password)
//        }
//
//        f4()
//        f4("000000")

        // TODO 带名参数
        // 马丁 ： 传参时将名称带上
        def f5( password:String = "000000", name:String ): Unit = {
            println(s"name : ${name}, password : ${password}")
        }

        //f5("123123", "zhangsan")
        f5(name="zhangsan")
    }
}
