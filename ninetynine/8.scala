object Problem8{

  def compress(list: List[Any]): List[Any] = list match { 
    case Nil => Nil
    case (head :: tail) => tail  match{
      case Nil => List[Any](head)
      case x if x(0) == head => return compress(x)
      case x if x(0) != head => return List[Any](head) ::: compress(x)
      case _ => tail
    }
  }

  def main(args: Array[String]) = 
    println(compress(List(9, 9, 3, 9, 1, 1)))
}
