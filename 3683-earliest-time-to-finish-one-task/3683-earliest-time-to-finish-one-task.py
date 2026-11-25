class Solution:
    def earliestTime(self, nums: List[List[int]]) -> int:
        res = [0]*len(nums)
        for i in range(len(nums)):
            for j in range(len(nums[i])):
                res[i]  +=  nums[i][j]
        return min(res)