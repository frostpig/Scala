/**
  * Created by Administrator on 2017/10/19.
  */
package com.twitter.example

object colorHolder {
  val BLUE = "Blue"
  val RED = "Red"
  //列表
  val numbers = List(1,2,3,4)
  //集合
  val mers = Set(1,1,2)

  //元组
  val hostPort = ("localhost",80)
  hostPort match {
    case ("localhost",port) =>
    case (host,port) =>
  }
  //两个元素的元组，使用特殊语法->
  1 -> 2

  Map(1->2)
  Map("foo" ->"bar")
  //变参列表
  Map(1->"one",2->"two")
  Map((1,"one"),(2,"two")) //和25行的效果一样

  //option
  trait  Option[T]{
    def isDefined:Boolean
    def get:T
    def getOrElse(t:T):T
   // 例子
    val numbers = Map("one" -> 1,"two" ->2)
    numbers.get("two")




  }
}

