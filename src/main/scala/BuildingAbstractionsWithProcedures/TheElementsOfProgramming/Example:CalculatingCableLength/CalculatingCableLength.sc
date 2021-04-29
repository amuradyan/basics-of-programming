def square(number: Double): Double = number * number

def abs(n: Double): Double = if (n > 0) {
  n
} else if (n == 0) {
  0
} else {
  -n
}

def goodEnough(guess: Double, number: Double): Boolean = abs(square(guess) - number) < 0.0001

def squareRootIteratively(guess: Double, number: Double): Double = if (goodEnough(guess, number)) {
  guess
} else {
  def newGuess = (guess + (number / guess)) / 2
  squareRootIteratively(newGuess, number)
}

squareRootIteratively(1, 25)
squareRootIteratively(1, 9)
squareRootIteratively(1, 4)

def squareRoot(number: Double): Double = squareRootIteratively(1, number)

def calculateCableLength(bridgeLength: Double, columnHeight: Double) = squareRoot(square(bridgeLength / 2) + square(columnHeight)) * 2

calculateCableLength(6, 4) * 2