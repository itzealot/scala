package com.zt.test.base

object TestOperation {

  def main(args: Array[String]) {
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;

    // 算数运算
    println("a + b = " + (a + b));
    println("a - b = " + (a - b));
    println("a * b = " + (a * b));
    println("b / a = " + (b / a));
    println("b % a = " + (b % a));
    println("c % a = " + (c % a));

    // 比较运算 
    println("a == b = " + (a == b));
    println("a != b = " + (a != b));
    println("a > b = " + (a > b));
    println("a < b = " + (a < b));
    println("b >= a = " + (b >= a));
    println("b <= a = " + (b <= a));

    // 布尔运算
    var aa = true;
    var bb = false;

    println("aa && bb = " + (aa && bb));

    println("aa || bb = " + (aa || bb));

    println("!(aa && bb) = " + !(aa && bb));

  }
}