package com.zt.test.collection

import Array._

object TestArray {

  def main(args: Array[String]): Unit = {
    // 声明数组，存储的是String，数组长度为3
    var z1: Array[String] = new Array[String](3)

    var z2 = new Array[String](3)

    z1(0) = "Runoob"; z1(1) = "Baidu"; z1(4 / 2) = "Google"

    var z3 = Array("Runoob", "Baidu", "Google")

    // 输出所有数组元素
    for (x <- z1) {
      print(x + ",")
    }

    println();

    // 输出所有数组元素
    for (x <- z3) {
      print(x + ",")
    }

    println();

    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // 计算数组所有元素的总会
    var total = 0.0;

    // index 遍历 startIndex to endIndex
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("总和为 " + total);

    // 查找数组中的最大元素
    var max = myList(0);
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max)
        max = myList(i);
    }
    println("最大值为 " + max);

    // 多维数组
    // 创建3 x 3 的二维举报
    var myMatrix = ofDim[Int](3, 3)

    // 给矩阵赋值
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j + i;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    // 合并数组，即首尾相连
    var myList3 = concat(myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3) {
      print(" " + x)
    }
    println();

    // 创建区间数组
    // [start, end) and add step
    var myList11 = range(10, 20, 2)
    
    // [start, end)
    var myList22 = range(10, 20)

    for (x <- myList11) {
      print(" " + x)
    }
    println();

    for (x <- myList22) {
      print(" " + x)
    }
    println();
  }
}