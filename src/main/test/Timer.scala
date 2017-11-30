
/**
  * Created by shuangshuangl on 2017/11/30.
  */
object Timer {
  def oncePerSecond(callback: () => Unit){

    while(true) {
       callback();
       Thread sleep 1000
       Thread `yield`()
     }
  }
/*

  def timeFlies(){
    print("time flies likes an arrow...")
  }
*/

  def main(args: Array[String]): Unit = {
    /*oncePerSecond(timeFlies)*/


    /*    使用匿名函数代替 timeFlies 函数
     代码中的右箭头‘=>’表明程序中存在一个匿名函数，箭头左边是匿名函数的参数列表，
    右边是函数体。在本例中，参数列表为空(箭头左边是一对空括号)，而函数体和改造前
    定义的 timeFlies 函数保持一致。
   */

    oncePerSecond(() => print("time flies like an arrow"))
  }


}
