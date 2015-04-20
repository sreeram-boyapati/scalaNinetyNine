object Problem5{

  def isPalindrome(list_of_items: List[Any]): Boolean = list_of_items match {
    case Nil => true
    case (x :: xs) => {
      if (xs == Nil)
        true
      else if (x != xs.last)
        false
      else 
        isPalindrome(list_of_items.drop(1).dropRight(1))
    }
  }
  
  
  def main(args: Array[String]) = 
    println(isPalindrome(List(1, 2, 3, 1)))
}
