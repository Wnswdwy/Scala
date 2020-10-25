package com.nswdwy.scala.chapter02

/**
 * @author yycstart
 * @create 2020-10-19 20:16
 */
object for_ {
  def main(args: Array[String]): Unit = {
    for ( i <- Range(1,5); j <- Range(1,4) ) {
      println("i1 = " + i + ",j1 = " + j )
    }
    for ( i <- Range(1,5) ) {
      for ( j <- Range(1,4) ) {
        println("i2 = " + i + ",j2 = " + j )
      }
    }

  }
}
