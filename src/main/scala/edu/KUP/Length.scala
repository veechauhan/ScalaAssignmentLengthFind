package edu.KUP

class LengthFind {

  def len(list: List[Int], accum: Int = 0): Int = {
    if (list.isEmpty) accum
    else {
      len(list.tail, accum + 1)
    }
  }
}


