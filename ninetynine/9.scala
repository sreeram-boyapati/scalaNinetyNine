object Problem9{

  def pack(list: List[Any]): List[Any] = { 
    def recPack(smallList: List[Any]): (List[Any], List[Any]) = smallList match{
      case Nil => (Nil, Nil)
      case (head :: tail) => tail match {
        case Nil => (Nil, List[Any](head))
        case x if x(0) == head => {
          val (i, j) = recPack(x)
          return (i, List[Any](head) ::: j)
        }
        case x if x(0) != head => { 
          return (x, List[Any](head))
        }
      }
    }
    var answer = List[Any]()
    var (remainingTail, processedHead) = (list, List[Any]())
    do {
      val i = recPack(remainingTail);
      remainingTail = i._1;
      processedHead = i._2;
      answer = answer ::: List(processedHead)
    } while(remainingTail != Nil)
    return answer
  }

  def main(args: Array[String]) = 
    println(pack(List(9, 9, 3, 9, 1, 1)))
}
