package com.zt.test.collection

object TestMap {
  def main(args: Array[String]): Unit = {
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    // 空 map
    // 空哈希表，键为字符串，值为整型
    var emptyMap: Map[Char, Int] = Map()
    
    // 可以使用 += 运算符添加元素 
    emptyMap += ('I' -> 1)
    emptyMap += ('J' -> 5)
    emptyMap += ('K' -> 10)
    emptyMap += ('L' -> 100)

    val nums: Map[Int, Int] = Map()

    println("colors 中的键为 : " + colors.keys)
    println("colors 中的值为 : " + colors.values)
    println("检测 colors 是否为空 : " + colors.isEmpty)
    println("检测 nums 是否为空 : " + nums.isEmpty)

    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    //  ++ 作为运算符
    var colors3 = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors3)

    //  ++ 作为方法
    colors3 = colors1.++(colors2)
    println("colors1.++(colors2)) : " + colors3)

    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    // 遍历Map
    // 遍历所有的 key
    // i 表示是 key 的变量
    sites.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + sites(i))
    }

    // 是否存在
    if (sites.contains("runoob")) {
      println("runoob 键存在，对应的值为 :" + sites("runoob"))
    } else {
      println("runoob 键不存在")
    }
  }
}