object Main {
  def main(args: Array[String]): Unit = {
    val stack = new KadaneStack[String]()
    stack.push("a")
    println("size = " + stack.stackSize)
    stack.push("wsdf")
    stack.push("asd")
    println(stack.pop())
    println(stack.empty().toString)
    println(stack.stack.toString)
    val s = new KadaneStack[Int]()
    s.push(1)
    s.push(-3)
    s.push(4)
    s.push(-1)
    s.push(2)
    s.push(1)
    s.push(-5)
    s.push(4)
    println("maxSum = " + s.maxSum())
//    println("mS = " + stack.maxSum())
  }
}
