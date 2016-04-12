package com.zt.test.collection

object TestList {
  // 字符串列表
  val site: List[String] = List("Runoob", "Google", "Baidu")

  // 构造列表的两个基本单位是 Nil 和 ::
  // Nil 也可以表示为一个空列表。
  val site2 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

  // 整型列表
  val nums: List[Int] = List(1, 2, 3, 4)
  val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))

  // 空列表
  val empty: List[Nothing] = List()
  val empty2 = Nil

  // 二维列表
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1))

  val dim2 = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  /**
   * Scala列表有三个基本操作：
   * head 返回列表第一个元素
   * tail 返回一个列表，包含除了第一元素之外的其他元素
   * isEmpty 在列表为空时返回true
   */

  def main(args: Array[String]): Unit = {
    val site3 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums3 = Nil

    println("第一网站是 : " + site3.head)
    println("最后一个网站是 : " + site3.tail)
    println("查看列表 site 是否为空 : " + site3.isEmpty)
    println("查看 nums 是否为空 : " + nums3.isEmpty)

    // 可以使用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表
    val site11 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site12 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符
    var fruit = site11 ::: site12
    println("site1 ::: site2 : " + fruit)

    // 使用 List.:::() 方法
    fruit = site11.:::(site12)
    println("site11.:::(site12) : " + fruit)

    // 使用 concat 方法
    fruit = List.concat(site11, site12)
    println("List.concat(site11, site12) : " + fruit)

    // List.fill() 方法来创建一个指定重复数量的元素列表
    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println("site : " + site)

    val num = List.fill(10)(2) // 重复元素 2, 10 次
    println("num : " + num)

    /**
     * List.tabulate() 方法是通过给定的函数来创建列表。
     * 方法的第一个参数为元素的数量，可以是二维的，
     * 第二个参数为指定的函数，我们通过指定的函数计算结果并返回值插入到列表中，起始值为 0
     */
    // 通过给定的函数创建 5 个元素
    // n from 0 to (n - 1)
    val squares = List.tabulate(5)(n => n * n)
    println("一维 : " + squares)

    // 创建二维列表
    // i * j: i from 0 to 3, j from 0 to 4
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)

    // List.reverse 用于将列表的顺序反转
    val site4 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println("site 反转前 : " + site4)

    println("site 反转前 : " + site4.reverse)
    
    
  }

}