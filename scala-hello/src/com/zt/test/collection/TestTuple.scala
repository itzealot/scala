package com.zt.test.collection

object TestTuple {
  def main(args: Array[String]) {

    // 与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
    // 元组的值是通过将单个的值包含在圆括号中构成的。
    // 目前 Scala 支持的元组最大长度为 22。对于更大长度你可以使用集合，或者扩展元组。
    val t = (4, 3, 2, 1)

    // 也可以通过该方式定义元组
    val t2 = new Tuple3(1, 3.14, "Fred")

    // 可以使用 t._1 访问第一个元素， t._2 访问第二个元素
    val sum = t._1 + t._2 + t._3 + t._4

    println("元素之和为: " + sum)

    // 可以使用 Tuple.productIterator() 方法来迭代输出元组的所有元素
    t.productIterator.foreach { i => println("Value = " + i) }

    println("连接后的字符串为: " + t.toString())

    // 元组2才支持交换
    val t22 = new Tuple2("www.google.com", "www.runoob.com")
    println("交换后的元组: " + t22.swap)
  }
}