package com.zt.test.obj

/**
 * 单例模式
 * 1). 在 Scala 中，是没有 static 这个东西的，但是它也为我们提供了单例模式的实现方法，那就是使用关键字 object。
 * 2). Scala 中使用单例模式时，除了定义的类之外，还要定义一个同名的 object 对象，它和类的区别是，object对象不能带参数。
 * 3). 当单例对象与某个类共享同一个名称时，他被称作是这个类的伴生对象：companion object。
 * 4). 你必须在同一个源文件里定义类和它的伴生对象。类被称为是这个单例对象的伴生类：companion class。
 * 5). 类和它的伴生对象可以互相访问其私有成员。
 *
 * 私有构造方法
 */
class Marker private (val color: String) {

  println("创建" + this)

  // 重写 toString 方法，必须使用 override 关键字
  override def toString(): String = "颜色标记：" + color

}

/**
 * 伴生对象，与类共享名字，可以访问类的私有属性和方法
 *
 * object 内的方法类似 static方法
 */
object Marker {
  // 私有Map常量 markers
  // 主类加载即构造
  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green"))

  def apply(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    // 通过object Marker 调用方法，类似static 方法调用
    println(Marker("red"))

    // 单例函数调用，省略了.(点)符号  
    println(Marker getMarker "blue")
  }
}