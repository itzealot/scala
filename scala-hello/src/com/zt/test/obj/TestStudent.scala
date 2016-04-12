package com.zt.test.obj

/**
 * 特征构造顺序
 * 特征也可以有构造器，由字段的初始化和其他特征体中的语句构成。这些语句在任何混入该特征的对象在构造是都会被执行。
 * 构造器的执行顺序：
 * --1). 调用超类的构造器；
 * --2). 特征构造器在超类构造器之后、类构造器之前执行；
 * --3). 特质由左到右被构造；
 * --4). 每个特征当中，父特质先被构造；
 * --5). 如果多个特征共有一个父特质，父特质不会被重复构造
 * --6). 所有特征被构造完毕，子类被构造。
 * 构造器的顺序是类的线性化的反向。线性化是描述某个类型的所有超类型的一种技术规格。
 *
 */
object TestStudent {

  def main(args: Array[String]) {
    val p1 = new Student("zhangsan", "boy")
    val p2 = new Student("lisi", "girl")
    val p3 = new Student("lisi", "girl")

    println(p1.isNotEqual(p2))
    println(p1.isEqual(p2))
    println(p2.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}