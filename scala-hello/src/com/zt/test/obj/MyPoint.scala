package com.zt.test.obj

/**
 * 定义类 MyPoint
 * 有构造函数： xc:Int, yc: Int
 *
 */
class MyPoint(val xc: Int, val yc: Int) {
  // 成员变量 x
  var x: Int = xc

  // 成员变量 y
  var y: Int = yc

  /**
   * 成员函数 move
   */
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy

    println("x 的坐标点: " + x);
    println("y 的坐标点: " + y);
  }
}