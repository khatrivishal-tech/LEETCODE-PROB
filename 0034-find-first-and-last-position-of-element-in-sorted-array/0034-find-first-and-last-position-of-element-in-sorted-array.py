class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        lis = [-1,-1]
        n = len(nums)
        if n == 0:
            return lis
        i = 0
        j = n - 1
        while i<=j:
            mid = (i+j)//2
            if nums[mid] == target:
                lis[0] = mid
                j = mid - 1
            elif nums[mid] < target:
                i = mid + 1
            else:
                j = mid -1
        #print(lis)
        i = 0
        j = n - 1
        while i<=j:
            mid = (i+j)//2
            if nums[mid] == target:
                lis[1] = mid
                i = mid + 1
            elif nums[mid] < target:
                i = mid + 1
            else:
                j = mid -1
        return lis     

