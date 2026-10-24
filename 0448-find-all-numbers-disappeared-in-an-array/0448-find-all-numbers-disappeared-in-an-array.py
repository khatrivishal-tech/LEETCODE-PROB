class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        s = set(nums)
        res=[]
        for i in range(1,n+1):
            if i not in s:
                res.append(i)

        return res
