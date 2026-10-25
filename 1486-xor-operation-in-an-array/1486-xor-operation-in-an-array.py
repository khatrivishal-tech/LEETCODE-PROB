class Solution(object):
    def xorOperation(self, n, start):
        """
        :type n: int
        :type start: int
        :rtype: int
        """
        res = 0
        arr = []
        for i in range(n):
            arr.append(start + 2 * i)
            res ^= arr[i]
        return res