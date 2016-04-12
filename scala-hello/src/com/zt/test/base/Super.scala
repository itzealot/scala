package com.zt.test

package base {
  class Super {
    // 只允许保护成员在定义了该成员的的类的子类中被访问。
    protected def f() { println("f") }
  }
  class Sub extends Super {
    f()
  }

  /**
   * 非子类访问非法
   */
  class Other {
    // 错误
    // (new Super).f()
  }
}