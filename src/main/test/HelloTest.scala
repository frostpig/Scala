import scala.collection.immutable.{HashMap, HashSet}

/**
  * Created by shuangshuangl on 2017/11/28.
  *
  * 简单的函数式编程
  */
object HelloTest {
  def main(args: Array[String]): Unit = {
   /*(1)
   args.foreach(arg => print(arg + " "))
   */

  /*
  （2） 数组
   var greetString = new Array[String](3)
    greetString(0) = "hello";
    greetString(1) = "world";
    greetString(2) = "!";

    for(i <- 0 to 2){   // i <- 这个表达式表示左边涵盖在右边范围之内
      print(greetString(i))
    }*/

   /*
    （3）List
    var list1 = List("aaa","bbb","ccc");
    var list2 = List("dddd");
    var list3 = list1 ::: list2  //::: 和 ::的区别
    list3.foreach(list => print(list + " "))*/


    /*
    (4) set
    var set = HashSet("b",3,"c")
    set += "very"
    set.foreach(value => print(value + " "))*/

    // (5) map
    var map = HashMap(1 -> "a",2 -> "b",3 -> "c")
    map += (4 -> "vv")
    map.foreach(value => print(value + " "))
  }

}
