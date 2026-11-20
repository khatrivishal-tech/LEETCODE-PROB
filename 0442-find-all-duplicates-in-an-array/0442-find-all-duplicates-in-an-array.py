class Solution:
    def findDuplicates(self, nums: list[int]) -> list[int]:
        dicti = {}
        ans = []
        for num in nums:
            if num not in dicti:
                dicti[num] = 1
            else:
                dicti[num] += 1
        for key,i in dicti.items():
            if i>=2:
                ans.append(key)
        return ans