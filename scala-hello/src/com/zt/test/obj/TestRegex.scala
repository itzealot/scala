package com.zt.test.obj
import scala.util.matching.Regex

object TestRegex {

  def main(args: Array[String]) {
    // Scala 通过 scala.util.matching 包种的 Regex 类来支持正则表达式。
    // 以下实例演示了使用正则表达式查找单词 Scala
    // 使用 String 类的 r() 方法构造了一个Regex对象。
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"

    // 使用 findFirstIn 方法找到首个匹配项。
    // 如果需要查看所有的匹配项可以使用 findAllIn 方法。
    println(pattern findFirstIn str)

    // 使用 mkString( ) 方法来连接正则表达式匹配结果的字符串，并可以使用管道(|)来设置不同的模式
    println((pattern findAllIn str).mkString(",")) // 使用逗号 , 连接返回结果

    val pattern1 = "(S|s)cala".r

    val str1 = "Scala is scalable and cool"
    // 使用 replaceFirstIn( ) 方法来替换第一个匹配项，使用 replaceAllIn( ) 方法替换所有匹配项
    println(pattern1 replaceFirstIn (str1, "Java"))

    // 正则表达式
    // \d 代表数字，\ 是转义字符，需要多加 \进行转义
    val pattern2 = new Regex("abl[ae]\\d+")
    val str2 = "ablaw is able1 and cool"

    println((pattern2 findAllIn str2).mkString(","))
  }
}