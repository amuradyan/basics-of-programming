def fib(n: Int): Int = if (n == 0) {
  0
} else if (n == 1) {
  1
} else {
  fib(n - 1) + fib(n -2)
}

assert(fib(0) == 0)
assert(fib(1) == 1)
assert(fib(3) == 2)

def loop(a: Int, b: Int, counter: Int): Int = if (counter == 0) {
  b
} else {
  loop(b, a + b, counter - 1)
}

def fibIterative(n: Int): Int = loop(1, 0, n)

assert(fibIterative(0) == 0)
assert(fibIterative(1) == 1)
assert(fibIterative(3) == 2)
