/**
  * Created by Administrator on 2017/10/18.
  */
object HelloWorld {
  def main(args: Array[String]) {
    val c = new Circle(2) ;

    //Object的声明不需要new ，class的声明需要new
    val a1 = ApplyTest;
    a1.apply();

    //静态类型语言
    var i = 0;
      while (i < args.length){
              print(args(i));
        i += 1;
      }
    print("\n"+i+"\n\r");


    val newFoo = HelloWorld();
    println("the color is :" +  com.twitter.example.colorHolder.BLUE)
    println(newFoo)
  }
//继承
  class ScientificCalculator(brand:String) extends Calculator(brand){
    def log(m:Double,base:Double) = math.log(m) / math.log(base)
  }

  //重载
  class EvenMoreScientficCalculator(brand:String) extends ScientificCalculator(brand ){
    def log(m:Int) : Double = log(m,math.exp(1))
  }

  //抽象类
  abstract  class Shape{
    def  getArea():Int   //
  }

  class Circle(r:Int) extends Shape{
    override def getArea() = {r * r * 3}
  }

  class Foo{

  }

  //apply方法
  def apply() = new Foo
  class Bar extends Function1[Int,Int]{
    def apply() = 0

    override def apply(v1: Int) :Int= v1+1

  }


}
