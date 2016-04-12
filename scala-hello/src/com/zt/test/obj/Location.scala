package com.zt.test.obj

/**
 * Scala继承一个基类跟Java很相似，只多了两点限制：
 * 1、重写方法需要override关键字
 * 2、只有主构造函数才可以往基类的构造函数里写参数。
 * Scala 的副构造函数必须调用主构造函数或另一个构造函数，在 Scala 里主构造函数如同一道关卡，类的实例需要通过他来初始化。
 *
 * 继承会继承父类的所有属性和方法，Scala 只允许继承一个父类
 */
class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends MyPoint(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz

    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
    println("z 的坐标点 : " + z);
  }
}

object Test {

  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15);

    // 移到一个新的位置
    loc.move(10, 10, 5);
  }
}