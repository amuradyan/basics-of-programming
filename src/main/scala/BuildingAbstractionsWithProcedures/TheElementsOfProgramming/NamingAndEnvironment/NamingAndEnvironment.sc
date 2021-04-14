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
