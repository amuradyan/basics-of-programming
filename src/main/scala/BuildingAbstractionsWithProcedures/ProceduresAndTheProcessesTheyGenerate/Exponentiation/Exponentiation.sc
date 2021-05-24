def exp(base: Int, power: Int): Int = if (power == 0) 1 else base * exp(base, power - 1)

assert(exp(-1, 0) == 1)
assert(exp(0, 0) == 1)
assert(exp(1, 0) == 1)
assert(exp(32165, 0) == 1)

assert(exp(2, 2) == 4)
assert(exp(-2, 2) == 4)

assert(exp(-10, 3) == -1000)
assert(exp(10, 3) == 1000)

exp(10, 5)

def expIter(base: Int, power: Int): Int = {
  def loop(counter: Int, acc: Int): Int = {
    if (counter == 0) {
      acc
    } else {
      loop(counter - 1, acc * base)
    }
  }

  loop(power, 1)
}

assert(expIter(-1, 0) == 1)
assert(expIter(0, 0) == 1)
assert(expIter(1, 0) == 1)
assert(expIter(32165, 0) == 1)

assert(expIter(2, 2) == 4)
assert(expIter(-2, 2) == 4)

assert(expIter(-10, 3) == -1000)
assert(expIter(10, 3) == 1000)

expIter(10, 5)

def square(number: Int): Int = number * number

def fastExp(base: Int, power: Int): Int = {
  if (power == 0) {
    1
  } else {
    if (power % 2 == 0) {
      square(fastExp(base, power / 2))
    } else {
      base * fastExp(base, power - 1)
    }
  }
}

assert(fastExp(-1, 0) == 1)
assert(fastExp(0, 0) == 1)
assert(fastExp(1, 0) == 1)
assert(fastExp(32165, 0) == 1)

assert(fastExp(2, 2) == 4)
assert(fastExp(-2, 2) == 4)

assert(fastExp(-10, 3) == -1000)
assert(fastExp(10, 3) == 1000)

fastExp(10, 5)
