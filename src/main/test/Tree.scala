import sun.reflect.generics.tree.Tree

/**
  * Created by shuangshuangl on 2017/11/30.
  */
abstract class Tree {

  /* Sum,Var,Const 就是条件类，他们与普通类的差异主要体现在以下几个方面
   1、新建条件类的实例，无须使用new 关键字（比如 可直接使用Const(5) 代替new Const(5)）
   2、自动为构造函数所带的参数创建对应的getter方法（即如果c是Const的实例，通过c.v即可访问）
   3、条件类都默认实现equals和hashCode两个方法，不过这两个方法都是基于实例的结构本身，而不是
    基于实例中可用于区分的值，这一点和java中Object 提供的同名方法的默认实现是基本一致的

   4、条件类还提供了一个默认的toString方法，能够以源码形式打印实例的值

   5、 条件类的实例可以通过模式匹配进行分解

   */
  case  class  Sum(l:Tree, r:Tree) extends  Tree
  case  class  Var(n :String) extends Tree
  case  class Const(v:Int) extends Tree
}
