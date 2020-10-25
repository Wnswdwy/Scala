package com.teacher.scala.day06.chapter07

object Scala16_Req {

    def main(args: Array[String]): Unit = {

        // TODO 不同省份的商品点击排行
        // 1. 获取数据集
        val list = List(
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "电脑"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "电脑"),
            ("zhangsan", "河南", "电脑"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子")
        )

        // 2. 将数据进行结构的转换
        // (姓名，省份，商品) => ( 省份-商品，1 )
        val mapList = list.map(
            t => {
                (t._2 + "-" + t._3, 1)
            }
        )

        // 3. 将转换结构后的数据进行分组聚合
        // ( 省份-商品，1 ) => ( 省份-商品，sum )
        val groupMap: Map[String, List[(String, Int)]] = mapList.groupBy(_._1)
//        val keySumList = groupMap.map(
//            t => {
//                val k = t._1
//                val list = t._2
//                (k, list.size)
//            }
//        )
        // 当对KV类型数据进行处理时，如果Key不变，只对V进行操作，其实可以采用mapValues
        val keySumMap: Map[String, Int] = groupMap.mapValues(list=>list.size)


        // 4. 将聚合后的结果进行结构的转换
        // map方法只改变和转换数据的结构和类型，但是外部的容器的类型不变的。
        // ( 省份-商品，sum ) => ( 省份，（商品，sum） )
        val keySumList: List[(String, Int)] = keySumMap.toList
        val prvToItemAndSumMap: List[(String, (String, Int))] = keySumList.map(
            t => {
                val k = t._1
                val sum = t._2
                val ks = k.split("-")
                (ks(0), (ks(1), sum))
            }
        )

        // 5. 将转换结构后的数据根据省份进行分组
        // ( 省份，（商品，sum） ) => ( 省份，Iterator【 (商品1，sum1),(商品2， sum2) 】 )
        val groupMap1: Map[String, List[(String, (String, Int))]] = prvToItemAndSumMap.groupBy(_._1)
        println("----------------------------")
        println(groupMap1)
        println("--------------------------------")
        // 6. 对分组后的数据进行排序（降序）
        val result = groupMap1.mapValues(
            list => {
                val itemSumList: List[(String, Int)] = list.map(_._2)
                // 排序
                itemSumList.sortBy(_._2)(Ordering.Int.reverse)//.take(3)
            }
        )

        // 7. 将结果打印在控制台上
        println(result)



    }
}
