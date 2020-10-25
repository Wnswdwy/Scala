package com.nswdwy.scala.chapter07_day06.practice


/**
 * @author yycstart
 * @create 2020-10-22 0:11
 */
object _6_Req {
    def main(args: Array[String]): Unit = {
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
        //2.数据进项结构转换,将省份和商品连接组成新的key   （姓名，省份，商品）=>（（省份，商品），1）
        val mapList: List[(String, Int)] = list.map(
            t => ( (t._2 + "-" + t._3), 1 )
        )
        //3.数据进项结构转换,然后对数据进行分组聚合 (（省份，商品）,sum)
        val stringToTuples: Map[String, List[(String, Int)]] = mapList.groupBy(_._1)
        //Map(河南-衣服 -> List((河南-衣服,1), (河南-衣服,1), (河南-衣服,1)), 河北-衣服 -> List((河北-衣服,1), (河北-衣服,1), (河北-衣服,1), (河北-衣服,1), (河北-衣服,1), (河北-衣服,1)), 河南-帽子 -> List((河南-帽子,1)), 河北-鞋 -> List((河北-鞋,1), (河北-鞋,1), (河北-鞋,1), (河北-鞋,1)), 河南-电脑 -> List((河南-电脑,1), (河南-电脑,1)), 河南-鞋 -> List((河南-鞋,1), (河南-鞋,1), (河南-鞋,1), (河南-鞋,1), (河南-鞋,1), (河南-鞋,1)), 河北-电脑 -> List((河北-电脑,1)), 河北-帽子 -> List((河北-帽子,1), (河北-帽子,1), (河北-帽子,1)))
        println(stringToTuples)
        println("-------------------------")
        val stringToInt: Map[String, Int] = stringToTuples.map(
            t => {
                val key: String = t._1
                val value: List[(String, Int)] = t._2
                (key, value.length)
            }
        )
        //Map(河南-衣服 -> 3, 河北-衣服 -> 6, 河南-帽子 -> 1, 河北-鞋 -> 4, 河南-电脑 -> 2, 河南-鞋 -> 6, 河北-电脑 -> 1, 河北-帽子 -> 3)
        println(stringToInt)
        println("-------------------------")

        //4.汇总数量( 省份，（商品，sum）)
        val getSumTuples: List[(String, (String, Int))] = stringToInt.toList.map(
            t => {
                val keys: Array[String] = t._1.split("-")
                val value: Int = t._2
                (keys(0), (keys(1), value))
            }
        )
        //List((河南,(衣服,3)), (河北,(衣服,6)), (河南,(帽子,1)), (河北,(鞋,4)), (河南,(电脑,2)), (河南,(鞋,6)), (河北,(电脑,1)), (河北,(帽子,3)))
        println(getSumTuples)
        println("--------------------------------------")
        //5. 将转换结构后的数据根据省份进行分组  (省份，intertor【（商品1，sum）】)
        val groupbypro: Map[String, List[(String, (String, Int))]] = getSumTuples.groupBy(_._1)
        //Map(河南 -> List((河南,(衣服,3)), (河南,(帽子,1)), (河南,(电脑,2)), (河南,(鞋,6))), 河北 -> List((河北,(衣服,6)), (河北,(鞋,4)), (河北,(电脑,1)), (河北,(帽子,3))))
        println(groupbypro)
        println("-----------------------------------")
        //6. 对分组后的数据进行排序（降序）
        val result: Map[String, List[(String, Int)]] = groupbypro.mapValues(
            list => {
                val tuples1: List[(String, Int)] = list.map(_._2)
                tuples1.sortBy(_._2)(Ordering.Int.reverse)
            }
        )
        println(result)
    }
}
