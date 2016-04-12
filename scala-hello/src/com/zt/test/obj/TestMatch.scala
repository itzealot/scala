package com.zt.test.obj

/**
 * 在声明样例类时，下面的过程自动发生了：
 * --1). 构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
 * --2). 在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
 * --3). 提供unapply方法使模式匹配可以工作；
 * --4). 生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。
 */
object TestMatch {
  def main(args: Array[String]) {
    println(matchTest(3))

    println(matchAny("two"))
    println(matchAny("test"))
    println(matchAny(1))
    println(matchAny(6))

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    // 遍历List
    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32)   => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }

  // 样例类
  // 使用了case关键字的类定义就是就是样例类(case classes)，样例类是种特殊的类，经过优化以用于模式匹配。
  case class Person(name: String, age: Int)

  /**
   * 一个模式匹配包含了一系列备选项，每个都开始于关键字 case。
   * 每个备选项都包含了一个模式及一到多个表达式。箭头符号 => 隔开了模式和表达式。
   *
   * x ---> Int 值
   * String ---> 返回值
   */
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  /**
   * match 对应 Java 里的 switch，但是写在选择器表达式之后。即： 选择器 match {备选项}。
   * match 表达式通过以代码编写的先后次序尝试每个模式来完成计算，只要发现有一个匹配的case，剩下的case不会继续匹配
   */
  def matchAny(x: Any): Any = x match {
    case 1      => "one"
    case "two"  => 2
    case y: Int => "scala.Int"
    case _      => "many"
  }
}