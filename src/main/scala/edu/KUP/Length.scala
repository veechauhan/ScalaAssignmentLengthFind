package edu.KUP

class LengthFind {

  def len(list: List[Int], accum: Int = 0): Int = {
    if (list.isEmpty) accum
    else {
      len(list.tail, accum + 1)
    }
  }
}

object Main extends App {
  val obj = new LengthFind
  val list: List[Int] = List(1, 0, 6)
  print(obj.len(list))
}
