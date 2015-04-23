object Problem12{

  def recDecode[A](head: List[A]): List[A] = {
    var size: Int = head(0).asInstanceOf[Int]
    val character: A = head(1)
    var result: List[A] = List()
    do {
      result = result ::: List(character)
      size = size - 1;
    } while(size > 0)
    return result
  }

  def decode[A](result: List[A], list: List[List[A]]): List[A] = list match {
    case Nil => result
    case (head :: tail) => {
      result ::: recDecode(head) ::: decode(result, tail)
    }
  }

  def main(args: Array[String]) = 
    println(decode[Int](Nil, List(List(2, 1), List(3, 9), List(1, 2))))
}
