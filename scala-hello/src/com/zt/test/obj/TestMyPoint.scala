package com.zt.test.obj

object TestMyPoint {

  def main(args: Array[String]) {
    // new MyPoint 对象
    val pt = new MyPoint(10, 20);

    // 移到一个新的位置
    pt.move(10, 10);
  }
}