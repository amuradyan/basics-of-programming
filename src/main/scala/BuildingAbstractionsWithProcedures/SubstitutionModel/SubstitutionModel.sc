def volumeInJan = 10
def volumeInFeb = 20

def oRate = 1
def hRate = 2 * oRate

def hTax(v: => Int, r: => Int): Int = v * r + 3

def hTaxForJanAndFeb(vJan: => Int, vFeb: => Int, rH: => Int): Int = hTax(vJan, rH) + hTax(vFeb, rH)

hTaxForJanAndFeb(volumeInJan, volumeInFeb, hRate)
hTaxForJanAndFeb(10, 20, 2 * 1)
hTaxForJanAndFeb(10, 20, 2)
hTax(10, 2) + hTax(20, 2)
{(10 * 2 + 3) + (20 * 2 + 3)}

hTaxForJanAndFeb(volumeInJan, volumeInFeb, hRate)
hTaxForJanAndFeb(10, 20, 2 * 1)
hTax(10, 2 * 1) + hTax(20, 2 * 1)
{(10 * (2 * 1) + 3) + (20 * (2 * 1) + 3)}
{(10 * 2 + 3) + (20 * 2 + 3)}
{20 + 3 + 40 + 3}
{66}

