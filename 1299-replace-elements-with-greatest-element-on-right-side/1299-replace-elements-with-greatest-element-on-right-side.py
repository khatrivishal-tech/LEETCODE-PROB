class Solution:
    def replaceElements(self, nums: list[int]) -> list[int]:
        n = len(nums)
        maxx = -1
        for i in range(n-1,-1,-1):
            cmax = nums[i]
            nums[i] = maxx
            if cmax > maxx:
                maxx = cmax
        return nums
            

