class Solution(object):
    def arithmeticTriplets(self, nums, diff):
        """
        :type nums: List[int]
        :type diff: int
        :rtype: int
        """
        cnt = 0
        for i in range(len(nums)-2):
            for j in range(1,len(nums)-1):
                if nums[j]-nums[i] == diff:
                    for k in range(2,len(nums)):
                        if nums[k]-nums[j]==diff:
                            cnt  += 1

        return cnt