class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxx = max(nums)
        cnt = 0
        for i in range(0,len(nums)):
            diff = 0
            if maxx != nums[i]:
                diff = maxx - nums[i]
            cnt += diff
        return cnt    
            