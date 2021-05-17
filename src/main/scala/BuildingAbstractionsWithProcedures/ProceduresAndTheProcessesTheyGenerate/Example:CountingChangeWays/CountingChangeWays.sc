def firstDenomination(kindsOfCoins: Int): Int = {
  if (kindsOfCoins == 1) 10
  else if (kindsOfCoins == 2) 20
  else if (kindsOfCoins == 3) 50
  else if (kindsOfCoins == 4) 100
  else if (kindsOfCoins == 5) 200
  else if (kindsOfCoins == 6) 500
  else 0
}

def countChangeLoop(amount: Int, kindsOfCoins: Int): Int = {
  if (amount == 0) 1
  else if (amount < 0 || kindsOfCoins == 0) 0
  else countChangeLoop(amount, kindsOfCoins - 1) + countChangeLoop(amount - firstDenomination(kindsOfCoins), kindsOfCoins)
}

def countChange(amount: Int): Int = countChangeLoop(amount, 5)

countChange(1000)

assert(countChange(10) == 1)
assert(countChange(20) == 2)
assert(countChange(30) == 2)
assert(countChange(40) == 3)
assert(countChange(50) == 4)