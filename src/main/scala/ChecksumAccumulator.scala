import scala.collection.mutable

/**
  * Created by shuangshuangl on 2017/12/12.
  */
class ChecksumAccumulator {
  private var sum = 0;

  def add (b: Byte) {sum += b}
  def checksum()  = ~(sum & 0xFF) + 1
}


//companion object
object ChecksumAccumulator{
  private val cache = mutable.Map[String,Int]()

  def calculate(s:String):Int =
    if (cache.contains(s))
      cache(s)
    else{
      val acc = new ChecksumAccumulator
      for (c <- s)
         acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}



