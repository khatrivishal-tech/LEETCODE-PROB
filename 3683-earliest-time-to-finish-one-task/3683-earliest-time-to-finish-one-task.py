class Solution:
    def earliestTime(self, nums: List[List[int]]) -> int:
        minn = 99999999
        for i in range(len(nums)):
            summ = sum(nums[i])
            if summ < minn:
                minn = summ
        return minn
