def moveTower(size: Int, from: Int, to: Int, extra: Int): Unit = {
  if (size != 0) {
    moveTower(size - 1, from, extra, to)
    println(s"Moving a disk from $from to $to")
    moveTower(size - 1, extra, to, from)
  }
}

moveTower(3, 1, 3, 2)