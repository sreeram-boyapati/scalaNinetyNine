object Problem5{

  def reverse(list_of_items: List[Any]): List[Any] = {
    def revList(result: List[Any], list: List[Any]): List[Any] = list match {
        case Nil => result
        case (x :: xs) => revList(x :: result, xs) 
    }
    revList(Nil, list_of_items)
  }
  
  def main(args: Array[String]) = 
    println(reverse((1 until 100).toList));

}
