package com.zt.test.collection

import scala.collection.mutable.Set // 可以在任何地方引入 可变集合

object TestMutableSet {

  def main(args: Array[String]): Unit = {
    val mutableSet = Set(1, 2, 3)

    // scala.collection.mutable.HashSet
    println(mutableSet.getClass.getName)

    // 添加元素
    mutableSet.add(4)

    // 移除元素
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2

    println(mutableSet) // Set(5, 3, 4)

    val another = mutableSet.toSet
    println(another.getClass.getName) // scala.collection.immutable.Set
  }
}