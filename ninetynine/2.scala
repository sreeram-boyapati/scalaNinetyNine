object Problem2{

  def penultimate(list_of_items: List[Any]): Any = 
    list_of_items(list_of_items.size - 2)

  def main(args: Array[String]) = 
    println(penultimate((1 until 100).toList));
}
