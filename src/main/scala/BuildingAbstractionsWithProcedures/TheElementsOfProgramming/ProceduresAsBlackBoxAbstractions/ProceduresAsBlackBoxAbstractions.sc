def calculateCableLength(bridgeLength: Double, columnHeight: Double) = {
  def square(number: Double): Double = (number / 2) * (number / 2) * 4
  
  def squareRoot(number: Double): Double = {

    def abs(number: Double): Double = if (number > 0) {
      number
    } else if (number == 0) {
      0
    } else {
      -number
    }

    def improve(guess: Double): Double = (guess + (number / guess)) / 2

    def goodEnough(guess: Double): Boolean = abs(square(guess) - number) < 0.0001

    def squareRootIteratively(guess: Double): Double = if (goodEnough(guess)) {
      guess
    } else {
      squareRootIteratively(improve(guess))
    }

    squareRootIteratively(1)
  }

  squareRoot(square(bridgeLength / 2) + square(columnHeight)) * 2
}

calculateCableLength(6, 4) * 2