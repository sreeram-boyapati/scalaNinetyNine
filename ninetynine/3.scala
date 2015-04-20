object Problem3{

  def nth(index: Int, list_of_items: List[Any]): Any = { 
    if (index > list_of_items.size && index < 0)
      return 0
    else if (index < list_of_items.size && index > 0)
      return list_of_items(index)
  }

  def main(args: Array[String]) = 
    println(nth(3, (1 until 100).toList));
    println(nth(1000, (1 until 100).toList));
}
