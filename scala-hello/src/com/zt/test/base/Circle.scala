package com.zt.test.base

object Circle {
  def main(args: Array[String]): Unit = {

    var a: Int = 10;

    while (a <= 20) {
      println("a = " + a)

      // 不支持 ++ 操作符
      a += 1;
    }
  }
}