package com.nswdwy.scala.chapter

/**
 * @author yycstart
 * @create 2020-10-17 11:49
 */
object Test {
  def main(args: Array[String]): Unit = {
//    val name : String = "zhangsan"
//    print(name)
//      10 + 10

//    for(i <- 1 to 5;j = (2*i -1)){
//      print(j)
//    }

  /*  for ( i <- 1 to 9) {
      val m = 2 * i -1
      println(" "*(9-i)+"*" * m)
    }*/

    for(i<- 1 to 9){
      print("  "*(9-i));
      print("^")
      println("v^"*(2*i-1))
    }
  }

}
