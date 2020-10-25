package com.teacher.scala.day05.chapter07

object Scala01_Collection_Array {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组

        // 创建数组
        // 数组有专门的类型Array
        // 编译后和java的数组完全相同
        val array: Array[String] = new Array[String](5)

        // 对数据进行操作
        // 数组的访问不能使用中括号，采用小括号访问,编译后其实就是中括号
        array(0) = "zhangsan"
        array(1) = "lisi"

        // 对数据进行遍历
        //println(array)
//        for ( s <- array ) {
//            println(s)
//        }
//        println(array.mkString(","))

        def foreachFunction(s:String): Unit = {
            println("s = " + s)
        }
        // foreach方法会将集合中的每一个元素用函数进行处理
        //array.foreach(foreachFunction)
//        array.foreach((s:String)=>{println("s =" +s)})
//        array.foreach((s)=>{println("s =" +s)})
//        array.foreach(s=>{println("s =" +s)})
//        array.foreach(s=>println("s =" +s))
//        array.foreach(println(_))
        array.foreach(println)

    }
}
