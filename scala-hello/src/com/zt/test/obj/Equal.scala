package com.zt.test.obj

/**
 * Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。
 * 与接口不同的是，它还可以定义属性和方法的实现。
 * 一般情况下Scala的类只能够继承单一父类，但是如果是 Trait(特征) 的话就可以继承多个，从结果来看就是实现了多重继承
 */
trait Equal {
  // isEqual 和 isNotEqual。isEqual 方法没有定义方法的实现，isNotEqual定义了方法的实现。
  // 子类继承特征可以实现未被实现的方法。所以其实 Scala Trait(特征)更像 Java 的抽象类。
  // Any 代表是任何类型即泛型
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}