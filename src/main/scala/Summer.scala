/**
  * Created by shuangshuangl on 2017/12/12.
  * 1、解释器里面先使用scalac或者fsc Summer.scala编译创建java文件
  * 2、scala Summer args 运行文件（不带后缀.scala）
  *
  */
import ChecksumAccumulator.calculate
object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " +  calculate(arg))

  }

}
