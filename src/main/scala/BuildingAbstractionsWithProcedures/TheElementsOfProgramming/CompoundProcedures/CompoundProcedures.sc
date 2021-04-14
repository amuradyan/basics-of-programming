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

// def processName(p1: T1, p2: T2, ...): T = /body/

def oTax(volume: Int, rate: Int): Int = volume * rate + 2
def hTax(volume: Int, rate: Int): Int = volume * rate + 3

def oTaxJan_ = oTax(volumeInJan, oRate)
def hTaxJan_ = hTax(volumeInJan, hRate)

def janTax_ = oTaxJan_ + hTaxJan_

def oTaxFeb_ = oTax(volumeInFeb, oRate)
def hTaxFeb_ = hTax(volumeInFeb, hRate)

def febTax_ = oTaxFeb_ + hTaxFeb_

janTax_ + febTax_

def monthlyTax(volume: Int, oRate: Int, hRate: Int): Int = oTax(volume, oRate) + hTax(volume, hRate)

def janTax__ = monthlyTax(volumeInJan, oRate, hRate)
def febTax__ = monthlyTax(volumeInFeb, oRate, hRate)

janTax__ + febTax__