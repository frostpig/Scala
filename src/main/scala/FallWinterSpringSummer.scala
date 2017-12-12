/**
  * Created by shuangshuangl on 2017/12/12.
  * Application声明了带有合适标签签名的main方法，并被继承，
  * 所以此单例对象中花括号之间的代码被收集进了单例对象的
  * 主构造器
  */
import  ChecksumAccumulator.calculate
object FallWinterSpringSummer  extends  Application{
   for(season <- List("fall","winter","spring"))
     println(season + ":" + calculate(season))
}
