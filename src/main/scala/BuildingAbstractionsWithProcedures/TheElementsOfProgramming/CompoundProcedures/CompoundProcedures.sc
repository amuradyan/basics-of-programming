(7 * 8 * 10) * 5 + ((7 * 8 * 10) / 10) * 3
(4 * 11 * 5) * 5 + ((4 * 11 * 5) / 10) * 3
(3 * 25 * 12) * 5 + ((3 * 25 * 12) / 10) * 3

def a1 = 7
def b1 = 8
def c1 = 10

def pricePerUnitVolume = 5
def pricePerTenthVolume = 3

(a1 * b1 * c1) * pricePerUnitVolume + ((a1 * b1 * c1) / 10) * pricePerTenthVolume

/////////////////////////////////////////////////////////

def hourly_pay = 10

def normal_salary(t: Int) = t * hourly_pay

def overtime_salary(t: Int) = 2 * normal_salary(t)

def salary(t_normal: Int, t_overtime: Int) = normal_salary(t_normal) + overtime_salary(t_overtime)

salary(5, 2)

//////////////////////////////////////////////////////////

// Volume in Jan - 6370
// Volume in Feb - 4570
// O rate - 14 per volume unit
// H rate - twice the O rate

6370 * 14 + 6370 * 28 + 
4570 * 14 + 4570 * 28

def volumeInJan = 6370
def volumeInFeb = 4570

def oRate = 14
def hRate = 2 * oRate

volumeInJan * oRate + volumeInJan * hRate + 
volumeInFeb * oRate + volumeInFeb * hRate

def oTaxJan = volumeInJan * oRate + 2 
def hTaxJan = volumeInJan * hRate + 3

def oTaxFeb = volumeInFeb * oRate + 2
def hTaxFeb = volumeInFeb * hRate + 3

oTaxJan + hTaxJan +
oTaxFeb + hTaxFeb

def janTax = oTaxJan + hTaxJan
def febTax = oTaxFeb + hTaxFeb

janTax + febTax

/////////////////////////////////////////////////////////////////////////////////

def oTax(v: Int, r: Int): Int = v * r + 2
def hTax(v: Int, r: Int): Int = v * r + 3

def oTaxJan_ = oTax(volumeInJan, oRate)
def hTaxJan_ = hTax(volumeInJan, hRate)

def oTaxFeb_ = oTax(volumeInFeb, oRate)
def hTaxFeb_ = hTax(volumeInFeb, hRate)

def janTax_ = oTaxJan_ + hTaxJan_
def febTax_ = oTaxFeb_ + hTaxFeb_

janTax_ + febTax_

//////////////////////////////////////////////////////////////////////////////////

def volumeInJan_ = 6370
def volumeInFeb_ = 4570

def oRate_ = 14
def hRate_ = 2 * oRate

def monthlyTax(v: Int, rO: Int, rH: Int): Int = oTax(v, rO) + hTax(v, rH)

def janTax__ = monthlyTax(volumeInJan_, oRate_, hRate_)
def febTax__ = monthlyTax(volumeInFeb_, oRate_, hRate_)

janTax__ + febTax__
