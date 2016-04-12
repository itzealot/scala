package com.zt.test.base

/**
 * Outer class
 */
class Outer {
  class Inner {
    /**
     * f 函数是 Inner 内部 private 成员
     */
    private def f() {
      println("f")
    }

    class InnerMost {
      f() // 正确
    }
  }

  // 错误，
  // (new Inner).f()
}