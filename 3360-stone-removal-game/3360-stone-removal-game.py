class Solution:
    def canAliceWin(self, n: int) -> bool:
        fir = 10
        if n < 10:
            return False
        while n >= fir:
            n = n - fir
            fir -= 1

            if n < fir:
                return True
            
            n = n - fir
            fir -= 1

            if n < fir:
                return False
        return False  
