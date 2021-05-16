def fib(index: Int): Int = if (index == 0) {
  0
} else if (index == 1) {
  1
} else {
  fib(index - 1) + fib(index - 2)
}

assert(fib(0) == 0)
assert(fib(1) == 1)
assert(fib(3) == 2)

def loop(a: Int, b: Int, counter: Int): Int = if (counter == 0) {
  b
} else {
  loop(b, a + b, counter - 1)
}

def fibIterative(index: Int): Int = {
  loop(0, 1, index)
}

assert(fibIterative(0) == 0)
assert(fibIterative(1) == 1)
assert(fibIterative(3) == 2)


fibIterative(4)
loop(0, 1, 4)
loop(1, 1, 3)
loop(1, 2, 2)
loop(2, 3, 1)
loop(3, 5, 0)