package com.zt.test.collection

object TestSet {

  def main(args: Array[String]): Unit = {

    // 默认是 scala.collection.immutable.Set 不可变集合
    val set = Set(1, 2, 3)

    // 获取全类名
    println(set.getClass.getName)

    // 是否存在偶数
    println(set.exists(_ % 2 == 0))

    // 移除元素1
    println(set.drop(1))

    val site = Set("Runoob", "Google", "Baidu")
    val nums: Set[Int] = Set()

    // head 返回集合第一个元素
    println("第一网站是 : " + site.head)

    // tail 返回一个集合，包含除了第一元素之外的其他元素
    println("最后一个网站是 : " + site.tail)

    // isEmpty 在集合为空时返回true
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println("查看 nums 是否为空 : " + nums.isEmpty)

    val site1 = Set("Runoob", "Google", "Baidu")
    val site2 = Set("Faceboook", "Taobao")

    // 使用 ++ 运算符或 Set.++() 方法来连接两个集合。如果元素有重复的就会移除重复的元素
    // ++ 作为运算符使用
    var site12 = site1 ++ site2
    println("site1 ++ site2 : " + site)

    //  ++ 作为方法使用
    site12 = site1.++(site2)
    println("site1.++(site2) : " + site)

    // Set.min 方法来查找集合中的最小元素，使用 Set.max 方法查找集合中的最大元素
    // 最大最小元素
    val num = Set(5, 6, 9, 20, 30, 45)

    // 查找集合中最大与最小元素
    println("Set(5,6,9,20,30,45) 集合中的最小元素是 : " + num.min)
    println("Set(5,6,9,20,30,45) 集合中的最大元素是 : " + num.max)

    // 使用 Set.& 方法或 Set.intersect 方法来查看两个集合的交集元素
    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    // 交集
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))
  }
}