object Problem9{

  def pack(list: List[Any]): List[Any] = { 
    def recPack(remainingTail: List[Int], smallList: List[Any]): (List[Any], List[Any]) = smallList match{
      case Nil => (Nil, Nil)
      case (head :: tail) => tail match {
        case Nil => (Nil, List[Any](head))
        case x if x(0) == head => {
          val (i, j) = recPack(Nil, x)
          return (i, List[Any](head) ::: j)
        }
        case x if x(0) != head => { 
          return (remainingTail ::: x, List[Any](head))
        }
      }
    }
    var answer = List[Any]()
    var (remainingTail, processedHead) = (List[Any](), List[Any]())
    remainingTail = list
    var length: Int = 0
    do {
      val i = recPack(Nil, remainingTail);
      remainingTail = i._1;
      length = remainingTail.length
      processedHead = i._2;
      answer = answer ::: List(processedHead)
    } while(length != 0)
    return answer
  }

  def main(args: Array[String]) = 
    println(pack(List(9, 9, 3, 9, 1, 1)))
}
