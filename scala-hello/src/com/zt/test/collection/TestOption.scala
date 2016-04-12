package com.zt.test.collection

object TestOption {

  def main(args: Array[String]): Unit = {
    // Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
    // Option[T] 是一个类型为 T 的可选值的容器： 
    // 如果值存在， Option[T] 就是一个 Some[T] ;如果不存在， Option[T] 就是对象 None 
    val myMap: Map[String, String] = Map("key1" -> "value")

    // 使用 Option[String] 来告诉你：[我会想办法回传一个 String，但也可能没有 String 给你]
    // myMap 里并没有 key2 这笔数据，get() 方法返回 None。
    // Option 有两个子类别，一个是 Some，一个是 None，
    // 当他回传 Some 的时候，代表这个函式成功地给了你一个 String，
    // 而你可以透过 get() 这个函式拿到那个 String，如果他返回的是 None，则代表没有字符串可以给你。
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value")

    // 有值则返回，类似guava 中的 Optional
    println(value1.get)

    println(value2) // None

    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
    println("sites.get( \"runoob\" ) : " + sites.get("runoob")) // Some(www.runoob.com)
    println("sites.get( \"baidu\" ) : " + sites.get("baidu")) //  None

    println("show(sites.get( \"runoob\")) : " + show(sites.get("runoob")))
    println("show(sites.get( \"baidu\")) : " + show(sites.get("baidu")))

    // 使用 getOrElse() 方法来获取元组中存在的元素或者使用其默认的值
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    // 不为空，返回默认值
    println("a.getOrElse(0): " + a.getOrElse(0))

    // 为 None 时返回给定的值
    println("b.getOrElse(10): " + b.getOrElse(10))

    // 使用 isEmpty() 方法来检测元组中的元素是否为 None，是则返回 true；否则返回false
    println("a.isEmpty: " + a.isEmpty)
    println("b.isEmpty: " + b.isEmpty)
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s // 返回字符串值

    case None    => "?" // 返回 ?
  }
}