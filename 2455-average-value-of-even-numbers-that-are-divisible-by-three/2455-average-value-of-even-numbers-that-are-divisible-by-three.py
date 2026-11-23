class Solution:
    def averageValue(self, nums: list[int]) -> int:
        summ = 0
        n = 0
        for num in nums:
            if num % 2 == 0 and num % 3 == 0:
                summ += num
                n += 1
        if n == 0:
            return 0
        else:
            return summ//n
        