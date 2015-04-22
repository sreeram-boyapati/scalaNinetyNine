import scala.collection.mutable.ListBuffer

object Problem7{

  def flattenList[A](list: List[Any]): List[A] = list match { 
    case Nil => List()
    case (head :: tail) => head match {
      case _: List[Any] =>
        flattenList(head.asInstanceOf[List[A]]) ::: flattenList(tail)
      case _ : A =>
        List(head.asInstanceOf[A]) ::: flattenList(tail)
    }
  }

  def main(args: Array[String]) = 
    println(flattenList[Any](List(9, List(5, 7, 8), 3, 1)))
}
