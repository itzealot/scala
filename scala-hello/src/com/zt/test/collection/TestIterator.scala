package com.zt.test.collection

object TestIterator {

  def main(args: Array[String]): Unit = {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext) {
      println(it.next())
    }

    val ita = Iterator(20, 40, 2, 50, 69, 90)
    // 使用 it.min 和 it.max 方法从迭代器中查找最大与最小元素
    // 只能迭代一次，再次使用 ita.max 方法会报错
    println("最大元素是：" + ita.max)

    val itb = Iterator(20, 40, 2, 50, 69, 90)
    println("最小元素是：" + itb.min)

    val itaa = Iterator(20, 40, 2, 50, 69, 90)
    val itbb = Iterator(20, 40, 2, 50, 69, 90)
    // 迭代器只能迭代一次
    println("ita.size 的值: " + itaa.size)
    println("itb.length 的值: " + itbb.length)
  }
}