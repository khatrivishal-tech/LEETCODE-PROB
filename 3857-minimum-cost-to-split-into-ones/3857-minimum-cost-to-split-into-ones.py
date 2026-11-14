class Solution(object):
    def minCost(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1:
            return 0
        c = 0
        #dup = n
        #for i in range(n,0,-1):
        a = n - 1
        b = 1
        c = a * b
        while a != 1:
            a = a - 1
            c += a * b   
        return c
            