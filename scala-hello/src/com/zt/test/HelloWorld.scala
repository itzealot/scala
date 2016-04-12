package com.zt.test

object HelloWorld {

  /**
   * HelloWorld for Scala
   * Unit : 返回值为空
   */
  def main(args: Array[String]): Unit = {
    println("HelloWorld!");
    println("Hello\tWorld!\nWith Me");
    println("=================");
    val res = """I love zf""";

    println(res);

    // 使用 var 声明变量
    var str1: String = "A String"
    println(str1);

    str1 = "A new String";
    println(str1);

    // 使用 val 声明常量
    val finalString: String = "A final String";
    println(finalString);
    // can't change the final value
    // finalString = "aa";

    println("=================")

    val xmax, ymax = 100 // xmax, ymax都声明为100
    println("xmax = " + xmax + ", ymax = " + ymax);

    // 声明元组， Pair 已 deprecated
    val (myVar1: Int, myVar2: String) = Tuple2(40, "Foo")
    println("myVar1 = " + myVar1 + ", myVar2 = " + myVar2);

    // 也可以不指定任何数据类型
    val (myVar11, myVar22) = Tuple2(40, "Foo")
    println("myVar11 = " + myVar11 + ", myVar22 = " + myVar22);
  }
}