// if (/cond1/) {
//     /body1/
// } else if (/cond2/) {
//     /body2/
// ...
// } else {
//     /bodyN/
// }

def abs(n: Int): Int = if (n > 0) {
                    n
                  } else if (n == 0) {
                    0
                  } else {
                    -n
                  }

abs(-5)
abs(5)
abs(0)

// The game

// Your friend thinks of a number between 1 and 100
// You bet some money and try to guess it. 
// 
// If your guess is 
// - correct: 3 * your bet
// - 15 away or a divisor: 2 * your bet
// - 15 to 40 away: your bet
// - futher than 40: you lost

def game(secretNumber: Int, guess: Int, bet: Int): Int = if (guess == secretNumber) {
  3 * bet
} else if (abs(guess - secretNumber) <= 15 || secretNumber % guess == 0) {
  2 * bet
} else if (15 < abs(guess - secretNumber) && abs(guess - secretNumber) < 40) {
  bet
} else {
  0
}

game(40, 40, 10)
game(40, 45, 10)
game(40, 10, 10)
game(40, 70, 10)
game(40, 90, 10)

// Vending machine
//
// The vending machine has the following options:
//  1. tea
//  2. coffee
//  3. juice
//  4. water
//  5. milk

// /name/ match {
//   case /value1/ => /body1/
//   case /value2/ => /body2/
//   ...
//   case _ => /body for all other cases/
// }

def vendingMachine(option: Int): String = if (option == 1) {
    "tea"
  } else if (option == 2) {
    "coffee"
  }else if (option == 3) {
    "juice"
  }else if (option == 4) {
    "water"
  }else if (option == 5) {
    "milk"
  }else {
    "Invalid option!"
  }

vendingMachine(1)
vendingMachine(2)
vendingMachine(3)
vendingMachine(4)
vendingMachine(5)
vendingMachine(6)

def vendingMachineViaMatch(option: Int): String = option match {
    case 1 => "tea"
    case 2 => "coffee"
    case 3 => "juice"
    case 4 => "water"
    case 5 => "milk"
    case _ => "Invalid option!"
  }

vendingMachineViaMatch(1)
vendingMachineViaMatch(2)
vendingMachineViaMatch(3)
vendingMachineViaMatch(4)
vendingMachineViaMatch(5)
vendingMachineViaMatch(6)