//       /||\       ^
//     /  ||  \     h
//   /    ||    \   |
// |======||======| v
// <-- l --------->  

// def sqrt(x: Int): Double = y, where { y >= 0 && y * y == x }

def precision = 0.000001

def square(number: Double): Double = number * number

def abs(n: Double): Double = if (n > 0) {
  n
} else if (n == 0) {
  0
} else {
  -n
}

def goodEnough(guess: Double, number: Double): Boolean = abs(square(guess) - number) < precision

def guessIteratively(guess: Double, number: Double): Double = if (goodEnough(guess, number)) {
  guess
} else {
  def newGuess = (guess + (number / guess)) / 2
  guessIteratively(newGuess, number)
}

def squareRoot(number: Double): Double = guessIteratively(1, number)

def calculateCableLength(bridgeLength: Double, columnHeight: Double) = squareRoot(square(bridgeLength / 2) + square(columnHeight)) * 2

squareRoot(25)

calculateCableLength(6, 4)
