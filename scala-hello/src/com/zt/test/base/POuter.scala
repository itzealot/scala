package com.zt.test.base

class POuter {
  class Inner {

    /**
     * 默认是 public 成员
     */
    def f() {
      println("f")
    }

    class InnerMost {
      f() // 正确
    }
  }

  // 正确,因为 f() 是 public
  (new Inner).f()
}