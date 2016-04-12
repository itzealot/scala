package com.zt.test.base

/**
 * object 声明入口
 * 
 */
object Condition {

  def main(args: Array[String]) {
    var x = 30;

    if (x < 20) {
      println("x 小于 20")
    } else {
      println("x 大于 20")
    }

    if (x == 10) {
      println("X 的值为 10");
    } else if (x == 20) {
      println("X 的值为 20");
    } else if (x == 30) {
      println("X 的值为 30");
    } else {
      println("无法判断 X 的值");
    }
  }

}