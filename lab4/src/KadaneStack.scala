class KadaneStack[T]() {
//  var l = List[Int]()
//  l = 6 :: l
  var stack = List[T]()

  def stackSize: Int = stack.length

  def pop(): T = {
    val head = stack.head
    stack = stack.tail
    return head
  }

  def push(st: T): Unit = {
    stack = st :: stack
  }

  def empty(): Boolean = {
    stack.isEmpty
  }

  def maxSum[T <: AnyVal]() = {
    try {
      var sum = 0.0;
      var ans = 0.0
      stack.foreach(s => {
        sum = sum +  s.toString.toDouble
        ans = math.max(ans, sum)
        sum = math.max(sum, 0)
      })
      ans
    }
    catch {
      case ex: Exception => throw new Exception("not number")
    }
  }
}
