
def squareRoot(number: Double): Double = ???

def square(number: Double): Double = number * number

def calculateCableLength(bridgeLength: Double, columnHeight: Double) = squareRoot(square(bridgeLength / 2) + square(columnHeight))

calculateCableLength(3, 4) == 5