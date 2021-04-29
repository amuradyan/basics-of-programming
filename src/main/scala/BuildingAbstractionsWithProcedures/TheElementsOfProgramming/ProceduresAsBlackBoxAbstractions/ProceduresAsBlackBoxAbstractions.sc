def calculateCableLength(bridgeLength: Double, columnHeight: Double) = {
  def square(number: Double): Double = (number / 2) * (number / 2) * 4

  def abs(number: Double): Double = if (number > 0) {
    number
  } else if (number == 0) {
    0
  } else {
    -number
  }

  def squareRootIterative(guess: Double, number: Double): Double = {
    def improve(guess: Double): Double = (guess + (number / guess)) / 2

    def goodEnough(guess: Double): Boolean = abs(square(guess) - number) < 0.00001

    if (goodEnough(guess)) {
      guess
    } else {
      squareRootIterative(improve(guess), number)
    }
  }

  def squareRoot(number: Double): Double = squareRootIterative(1, number)
  
  squareRoot(square(bridgeLength / 2) + square(columnHeight)) * 2
}

calculateCableLength(10, 4)
