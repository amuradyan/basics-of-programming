def denomination(kindsOfCoins: Int): Int = {
  if (kindsOfCoins == 1) 10
  else if (kindsOfCoins == 2) 20
  else if (kindsOfCoins == 3) 50
  else if (kindsOfCoins == 4) 100
  else if (kindsOfCoins == 5) 200
  else if (kindsOfCoins == 6) 500
  else 0
}

assert(denomination(0) == 0)
assert(denomination(1) == 10)
assert(denomination(2) == 20)
assert(denomination(3) == 50)
assert(denomination(4) == 100)
assert(denomination(5) == 200)
assert(denomination(6) == 500)
assert(denomination(7) == 00)

def countChangeWays(amount: Int, kindsOfCoins: Int): Int = {
  if (amount == 0) 1
  else if(amount < 0 || kindsOfCoins == 0) 0
  else countChangeWays(amount, kindsOfCoins - 1) + countChangeWays(amount - denomination(kindsOfCoins), kindsOfCoins) 
}

countChangeWays(1000, 6)

assert(countChangeWays(0, 1) == 1)
assert(countChangeWays(0, -1) == 1)
assert(countChangeWays(0, 10) == 1)
assert(countChangeWays(-1, 1) == 0)
assert(countChangeWays(-1, -1) == 0)
assert(countChangeWays(-1, 10) == 0)
assert(countChangeWays(-1,0) == 0)
assert(countChangeWays(0, 0) == 1)
assert(countChangeWays(1, 0) == 0)
assert(countChangeWays(10, 6) == 1)
assert(countChangeWays(20, 6) == 2)
assert(countChangeWays(30, 6) == 2)