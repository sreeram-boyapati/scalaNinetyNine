object Problem4{

  def length(list_of_items: List[Any]): Int = 
    list_of_items.size

  def main(args: Array[String]) = 
    println(length((1 until 100).toList));
}
