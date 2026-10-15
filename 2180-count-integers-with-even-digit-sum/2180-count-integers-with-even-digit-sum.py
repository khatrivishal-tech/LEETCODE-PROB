class Solution(object):
    def countEven(self, num):
        """
        :type num: int
        :rtype: int
        """
        cnt=0
        for x in range(1,num+1):
            summ=0
            while x!=0:
                dig = x % 10
                summ += dig
                x = x // 10
            if summ % 2 == 0:
                cnt=cnt+1
        return cnt