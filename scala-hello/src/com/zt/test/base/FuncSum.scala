package com.zt.test.base
import java.util.Date
import scala.math.BigInt.int2bigInt

object FuncSum {

  def main(args: Array[String]): Unit = {
    println("3 + 2 = " + sum(3, 2));

    printMe()

    printMe

    println("----------------------------");

    delayed(time)

    println("----------------------------");
    // 可以通过指定函数参数名，并且不需要按照顺序向函数传递参数
    printInt(b = 5, a = 7);

    println("----------------------------");
    printStrings("Runoob", "Scala", "Python");

    println("----------------------------");
    // for to 遍历
    for (i <- 1 to 10) {
      println(i + " 的阶乘为: = " + factorial(i));
    }

    println("----------------------------");
    println("返回值 : " + addInt());

    println("----------------------------");
    // 高阶函数（Higher-Order Function）就是操作其他函数的函数。
    // Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果
    println(apply(layout, 10))

    println("----------------------------");
    println(factorial2(1))
    println(factorial2(2))

    println("----------------------------");
    // 匿名函数 x + 1
    var inc = (x: Int) => x + 1
    println("inc = " + inc(2))

    println("----------------------------");
    // 匿名函数 x * y
    var mul = (x: Int, y: Int) => x * y
    println("mul = " + mul(2, 3))

    println("----------------------------");
    // 也可以不给匿名函数设置参数
    var userDir = () => { System.getProperty("user.dir") }
    // 调用
    println(userDir())

    println("----------------------------");
    // 调用匿名函数原型
    println(add2(3));

    println("----------------------------");
    val date = new Date
    log(date, "message1")

    println("----------------------------");
    // 第二个参数使用下划线(_)替换缺失的参数列表，并把这个新的函数值的索引的赋给变量
    val logWithDateBound = log(date, _: String)
    logWithDateBound("message1")

    println("----------------------------");
    // add(1)(2),最后结果都一样是3，这种方式（过程）就叫柯里化。
    def add(x: Int)(y: Int) = x + y
    println(add(1)(2))

    println("----------------------------");
    // 这样定义的函数变量 multiplier 成为一个"闭包"，因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
    println(multiplier(1))
    println(multiplier(2))

    println("----------------------------");
    val buf = new StringBuilder;
    
    // StringBuilder 对象
    // += 拼接单个字符
    buf += 'a'
    
    // ++= 拼接多个字符
    buf ++= "bcdef"
    
    println("buf is : " + buf.toString);
  }

  var factor = 3
  val multiplier = (i: Int) => i * factor

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }

  /**
   * 匿名函数实现原型
   *
   */
  def add2 = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1;
  }

  /**
   * 函数嵌套
   * 参数 i: Int
   * 返回值Int
   */
  def factorial2(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    fact(i, 1)
  }

  /**
   * 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
   *
   * apply() 函数使用了另外一个函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
   */
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

  /**
   * 递归函数
   */
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      return 1
    return n * factorial(n - 1)
  }

  /**
   * 定义 sum 函数
   *
   */
  def sum(a: Int, b: Int): Int = {
    return a + b;
  }

  def printMe(): Unit = {
    println("Hello, Scala!")
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  /**
   * delayed 方法， 该方法在变量名和变量类型使用 => 符号来设置传名调用。
   * elay 方法打印了一条信息表示进入了该方法，接着 delay 方法打印接收到的值，最后再返回 t
   */
  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    // 调用方法
    t
  }

  /**
   * 打印参数值
   */
  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }

  /**
   * 函数可变参数.<br />
   * 通过在参数的类型之后放一个星号来设置可变参数(可重复的参数)
   */
  def printStrings(args: String*) = {
    var i: Int = 0;

    // 使用for 关键字以及 <- 来实现遍历
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);

      i = i + 1;
    }
  }

  /**
   * 默认参数
   */
  def addInt(a: Int = 5, b: Int = 7): Int = {
    return a + b
  }
}