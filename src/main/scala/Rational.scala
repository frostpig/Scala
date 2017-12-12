/**
  * Created by shuangshuangl on 2017/12/12.
  */
class Rational(n:Int,d:Int) {

  require(d !=0)
  val number : Int = n
  val denom :Int = d
  override def toString = number + "/" + denom
  def add(that :Rational) : Rational =
    new Rational(number * that.denom + that.number *denom ,denom *that.denom)

}
