/**
  * Created by shuangshuangl on 2017/11/30.
  *
  * BigInt
  */
object Basic {
  def factoria( x:BigInt ): BigInt =
    if (x == 0) 1 else x * factoria(x-1)

  def main(args: Array[String]): Unit = {
    print(factoria(30))
  }
}
