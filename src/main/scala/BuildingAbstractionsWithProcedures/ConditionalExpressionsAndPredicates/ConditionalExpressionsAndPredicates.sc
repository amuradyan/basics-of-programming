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