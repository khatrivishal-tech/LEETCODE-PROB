class Solution(object):
    def minimumSumSubarray(self, nums, l, r):
        """
        :type nums: List[int]
        :type l: int
        :type r: int
        :rtype: int
        """
        mini = sys.maxsize
        n = len(nums)
        for i in range(n):
            for j in range(i+1,n+1):
                for j in range(i + 1, n + 1):
                    if l <= len(nums[i:j]) <= r:
                        summ = sum(nums[i:j])
                        if summ < mini and summ > 0:
                            mini = summ
        if mini == sys.maxsize:
            return -1
        else:
            return mini
