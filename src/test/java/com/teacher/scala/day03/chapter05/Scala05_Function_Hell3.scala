package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell3 {

    def main(args: Array[String]): Unit = {

        /*
        // TODO 函数也是对象
        def test(): Unit = {
            //println()
        }
        // User user = new User()
        // println(user)
        val f = test _
        println(f)
         */

        // TODO 匿名函数的至简原则
        def test( name:String ): Unit = {
            println(name)
        }

        def fn( f : (String)=>Unit ): Unit = {
            f("zhangsan")
        }

//        fn( test )
//        fn( (name:String)=>{println(name)} )
//        fn( (name)=>{println(name)} )
//        fn( name=>{println(name)} )
//        fn( name=>println(name) )
        //fn( println(_) ) // 匿名函数至简版
//        fn( println )  // 函数就叫println

        /*def test(x:Int, y:Int, f:(Int, Int)=>Int) = {
            f( x, y )
        }*/

//        test(10, 20, (x:Int, y:Int)=>{x + y})
//        test(10, 20, (x, y)=>{x + y})
//        test(10, 20, (x, y)=>x + y)
        // 匿名函数中，参数在逻辑中处理中只使用了一次，那么可以采用下划线代替
        // 参数如果出现多次，或使用的顺序不正确，那么无法使用下划线代替
       /* println(test(10, 20, _ + _))
        println(test(10, 20, _ * _))
        println(test(10, 20, _ - _))
        println(test(10, 20, _ / _))*/





    }
}
