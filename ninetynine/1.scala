object Problem1{

  def last(list_of_items: List[Any]): Any = 
    list_of_items(list_of_items.size - 1)

  def main(args: Array[String]) = 
    println(last((1 until 100).toList));
}
