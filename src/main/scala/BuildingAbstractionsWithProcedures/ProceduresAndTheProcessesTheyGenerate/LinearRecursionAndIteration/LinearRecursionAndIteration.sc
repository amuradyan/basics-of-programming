def possiblePassesRecursively(allowedSymbols: Int, segmentLength: Int): Int = {
  if (segmentLength == 1) {
      allowedSymbols
    } else {
      allowedSymbols * possiblePassesRecursively(allowedSymbols - 1, segmentLength - 1)
  }
}

10 * 9 * 8 * 7 * 6

possiblePassesRecursively(10, 5)
{10 * possiblePassesRecursively(9, 4)}
{10 * {9  * possiblePassesRecursively(8, 3)}}
{10 * {9 * {8  * possiblePassesRecursively(7, 2)}}}
{10 * {9 * {8 * {7 * possiblePassesRecursively(6, 1)}}}}
{10 * {9 * {8 * {7 * 6}}}}
{10 * {9 * {8 * 42}}}
{10 * {9 * 336}}
{10 * 3024}
30240

def loop(counter: Int, accumulator: Int, allowedSymbols: Int, segmentLength: Int): Int = {
  if (counter == segmentLength) {
    accumulator
  } else {
    loop(counter + 1, accumulator * (allowedSymbols - counter), allowedSymbols, segmentLength)
  }
}

def numberOfPossibilitiesIteratively(allowedSymbols: Int, segmentLength: Int): Int = {
  loop(0, 1, allowedSymbols, segmentLength)
}

numberOfPossibilitiesIteratively(10, 5)
loop(0, 1, 10, 5)
loop(1, 10, 10, 5)
loop(2, 90, 10, 5)
loop(3, 720, 10, 5)
loop(4, 5040, 10, 5)
loop(5, 30240, 10, 5)
30240
