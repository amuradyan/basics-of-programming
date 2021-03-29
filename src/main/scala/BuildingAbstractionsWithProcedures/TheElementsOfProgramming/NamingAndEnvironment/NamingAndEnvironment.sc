10 * 8 + 9 * 9

def planesBoughtInJan = 10
def priceOfAPlaneInJan = 8

def planesBoughtInFeb: Int = 9
def priceOfAPlaneInFeb = 9

planesBoughtInFeb

def moneySpentOnPlanesInJanAndFeb = planesBoughtInJan * priceOfAPlaneInJan + 
  planesBoughtInFeb * priceOfAPlaneInFeb

moneySpentOnPlanesInJanAndFeb + 1

moneySpentOnPlanesInJanAndFeb == 10 * 8 + 9 * 9

def planeLuxuryTax = moneySpentOnPlanesInJanAndFeb * 0.1

//////////////////////////////////////////////

{
  ((7 * 8 * 10) * 5 + ((7 * 8 * 10) / 10) * 3) +
  ((4 * 11 * 5) * 5 + ((4 * 11 * 5) / 10) * 3) +
  ((3 * 25 * 12) * 5 + ((3 * 25 * 12) / 10) * 3)
}

//////////////////////////////////////////////

def a1 = 7
def b1 = 8
def c1 = 10

def a2 = 4
def b2 = 11
def c2 = 5

def a3 = 3
def b3 = 25
def c3 = 12

def pricePerUnitVolume = 5
def pricePerTenthVolume = 3

(a1 * b1 * c1) * pricePerUnitVolume + ((a1 * b1 * c1) / 10) * pricePerTenthVolume +
(a2 * b2 * c2) * pricePerUnitVolume + ((a2 * b2 * c2) / 10) * pricePerTenthVolume +
(a3 * b3 * c3) * pricePerUnitVolume + ((a3 * b3 * c3) / 10) * pricePerTenthVolume

//////////////////////////////////////////////

def v1 = a1 * b1 * c1
def v2 = a2 * b2 * c2
def v3 = a3 * b3 * c3

v1 * pricePerUnitVolume + (v1 / 10) * pricePerTenthVolume +
v2 * pricePerUnitVolume + (v2 / 10) * pricePerTenthVolume +
v3 * pricePerUnitVolume + (v3 / 10) * pricePerTenthVolume

//////////////////////////////////////////////

def normalTax1 = v1 * pricePerUnitVolume
def normalTax2 = v2 * pricePerUnitVolume
def normalTax3 = v3 * pricePerUnitVolume

def tenthTax1 = (v1 / 10) * pricePerTenthVolume
def tenthTax2 = (v2 / 10) * pricePerTenthVolume
def tenthTax3 = (v3 / 10) * pricePerTenthVolume

normalTax1 + tenthTax1 +
normalTax2 + tenthTax2 +
normalTax3 + tenthTax3

//////////////////////////////////////////////

def totalTax1 = normalTax1 + tenthTax1
def totalTax2 = normalTax2 + tenthTax2
def totalTax3 = normalTax3 + tenthTax3

def totalTax = totalTax1 + totalTax2 + totalTax3

totalTax

// def a1 = 7
// def b1 = 8
// def c1 = 10

// def a2 = 4
// def b2 = 11
// def c2 = 5

// def a3 = 3
// def b3 = 25
// def c3 = 12

// def pricePerUnitVolume = 5
// def pricePerTenthVolume = 3

// def v1 = a1 * b1 * c1
// def v2 = a2 * b2 * c2
// def v3 = a3 * b3 * c3

// def normalTax1 = v1 * pricePerUnitVolume
// def normalTax2 = v2 * pricePerUnitVolume
// def normalTax3 = v3 * pricePerUnitVolume

// def tenthTax1 = (v1 / 10) * pricePerTenthVolume
// def tenthTax2 = (v2 / 10) * pricePerTenthVolume
// def tenthTax3 = (v3 / 10) * pricePerTenthVolume

// def totalTax1 = normalTax1 + tenthTax1
// def totalTax2 = normalTax2 + tenthTax2
// def totalTax3 = normalTax3 + tenthTax3

// def totalTax = totalTax1 + totalTax2 + totalTax3

def volume(a: Int, b: Int, c: Int): Int = a * b * c

((7 * 8 * 10) * 5 + ((7 * 8 * 10) / 10) * 3) +
((4 * 11 * 5) * 5 + ((4 * 11 * 5) / 10) * 3) +
((3 * 25 * 12) * 5 + ((3 * 25 * 12) / 10) * 3)

