import scala.io.Source

/**
  * Created by shuangshuangl on 2017/12/12.
  *  解释器执行命令调用脚本本身 scala s.scala s.scala
  *  从文件里读取文本行
  *
  *  ps:解释器运行时文件中不能出现中文 否则报错
  */
object s {
  def main(args: Array[String]): Unit = {
    def widthOfLength(s:String) = s.length.toString.length
    if (args.length > 0){
      val lines = Source.fromFile(args(0)).getLines.toList;
      val longestLine = lines.reduceLeft(
        (a,b) => if(a.length > b.length) a else  b
      )
      val maxWidth = widthOfLength(longestLine)
      for (line <- lines) {
        val numSpaces = maxWidth-widthOfLength (line)
        val padding = " " * numSpaces
        println(padding+line.length + "|" + line)
      }
    }else
      Console.err.println("please enter fileName")
  }

}




