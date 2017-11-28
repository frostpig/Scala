/**
  * Created by Administrator on 2017/10/19.
  */
class Calculator(brand : String) {
  val color:String = if (brand == "IT"){
    "blue"
  }else if (brand == "HP") {
    "black"
  }else{
    "white"
  }
  def add(m:Int,n:Int) :Int = m+n
}
