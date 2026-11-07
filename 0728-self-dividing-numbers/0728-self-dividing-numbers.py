class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        res = []
        for num in range(left,right+1):
            if '0' in str(num):
                continue
            
            temp = num
            is_dividing = True
            while temp > 0:
                digit = temp % 10
                if num % digit != 0:
                    is_dividing = False
                    break
                temp = temp // 10
            if is_dividing:
                res.append(num)
        return res         