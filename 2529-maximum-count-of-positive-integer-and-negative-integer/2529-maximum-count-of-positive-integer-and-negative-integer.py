class Solution(object):
    def maximumCount(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        pos = 0 
        neg = 0
        for num in nums:
            if num == 0:
                continue
            elif num > 0:
                pos += 1
            else:
                neg += 1
        if pos >= neg:
            return pos
        else:
            return neg 