package com.zt.test.base

object TestString {

  // 常量字符串
  // 字符串的类型实际上是 Java String，它本身没有 String 类
  // String 是一个不可变的对象，所以该对象不可被修改。这就意味着你如果修改字符串就会产生一个新的字符串对象。
  val greeting: String = "Hello,World!"

  // 字符串修改后，即指针指向新的字符串
  var greeting2: String = "Hello World!";

  def main(args: Array[String]) {
    println(greeting)
    println(greeting2)

    // 可变字符串，使用 StringBuilder
    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"

    // 调用toString 方法
    println("buf is : " + buf.toString);

    // 字符串长度
    var palindrome = "www.runoob.com";
    var len = palindrome.length();
    println("String Length is : " + len);

    // 字符串连接
    println("Hello ".concat("World"))

    println("Hello " + "World")

    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"

    // 创建格式化字符串
    // %f : Float
    // %d : Int
    // %s : String
    var fs = printf("浮点型变量为 " +
      "%f, 整型变量为 %d, 字符串为 " +
      " %s", floatVar, intVar, stringVar)

    println(fs)
  }
}