package com.zt.test.obj

class Student(val na: String, val se: String) extends Equal {
  val name: String = na;
  val sex: String = se;

  /**
   * Any methos:
   * isInstanceOf[Student] : 是否是 Student类 的实例
   * asInstanceOf[Student] : 转为 Student 的实例
   */
  def isEqual(obj: Any) =
    obj.isInstanceOf[Student] &&
      obj.asInstanceOf[Student].name == name
}