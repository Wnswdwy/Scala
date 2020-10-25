package com.teacher.scala.day03.chapter05

/**
 * @author yycstart
 * @create 2020-10-20 18:13
 */
object Scala05_Function_Hell2 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版

        // TODO 将函数作为参数进行传递
        /*
          // 另外一个函数
           public void test( User user ) {

           }

           User user = new User(); // 函数对象
           test(user)

         */

        def test( f : (String)=>String) = {
            f("zhangsan")
        }

        def f( s : String ): String = {
            s * 2
        }

        val v = f _

        println(test(v))
        /*def test( name : String, f: (String)=> String ):Unit = {
            println(f(name))
        }*/

//        def f( s : String ): String = {
//            s * 2
//        }
        /*
          User y= new User();
          User g = y
          b.name
          b.age
          b.login

         */
        // 如果函数的名称不重要，那么可以声明关键字和名称
        //val a = (s:String)=>{ s * 2 }
        //println(test(a))
        // TODO : 完整的写法
        //test( (s: String) => {s * 2} )
        // TODO : 匿名函数也可以遵循至简原则
        // 1. 如果参数类型可以推断，那么类型可以省略
        //test( (s) => {s * 2}  )
        // 2. 如果参数列表中只有一个参数，那么小括号可以省略
        //test( s => {s * 2} )
        // 3. 如果函数的逻辑代码只有一行，那么大括号可以省略
        //test( s => s * 2 )
        // 4. 如果函数逻辑中，参数只使用了一次，那么可以省略这个参数,使用下划线代替
//        test( "lisi", _ * 2)


    }
}
