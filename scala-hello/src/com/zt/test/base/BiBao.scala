package com.zt.test.base

object BiBao {

  def main(args: Array[String]) {
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
  }

  /**
   * 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
   * 闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。
   */

  // 引入一个自由变量 factor，这个变量定义在函数外面
  val factor = 3

  /**
   * 定义的函数变量 multiplier 成为一个"闭包"，
   * 因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
   */
  val multiplier = (i: Int) => i * factor
}