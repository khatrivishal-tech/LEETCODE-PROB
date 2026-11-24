class Solution:
    def sortEvenOdd(self, nums: list[int]) -> list[int]:
        odd = [] 
        even = []
        n = len(nums)
        for i in range(n):
            if i % 2 == 0:
                even.append(nums[i])
            else:
                odd.append(nums[i])
        even.sort()
        odd.sort(reverse=True)
        res = []
        for i in range(n):
            if i % 2 == 0:
                res.append(even[i//2])
            else:
                res.append(odd[(i//2)])
        return res
