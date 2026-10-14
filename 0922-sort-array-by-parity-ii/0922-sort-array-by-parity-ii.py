class Solution(object):
    def sortArrayByParityII(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        odd = 1
        eve = 0
        ans=[0]*len(nums)
        for i in nums:
            if i%2==0:
                ans[eve]=i
                eve += 2
            else:
                ans[odd]=i
                odd += 2
        return ans