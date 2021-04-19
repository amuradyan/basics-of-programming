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
{(20 + 3) + (20 * 2 + 3)}
{23 + (20 * 2 + 3)}
{23 + (40 + 3)}
{23 + 43}
{66}

hTaxForJanAndFeb(volumeInJan, volumeInFeb, hRate)
hTax(volumeInJan, hRate) + hTax(volumeInFeb, hRate)
{(volumeInJan * hRate + 3) + (volumeInFeb * hRate + 3)}
{(volumeInJan * hRate + 3) + (20 * (2 * 1) + 3)}
{(volumeInJan * hRate + 3) + (20 * 2 + 3)}
{(volumeInJan * hRate + 3) + (40 + 3)}
{(volumeInJan * hRate + 3) + 43}
{(10 * (2 * 1) + 3) + 43}
{(10 * 2 + 3) + 43}
{(20 + 3) + 43}
{23 + 43}
{66}