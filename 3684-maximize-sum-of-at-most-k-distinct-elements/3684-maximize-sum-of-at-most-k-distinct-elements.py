class Solution:
    def maxKDistinct(self, nums: List[int], k: int) -> List[int]:
        s = sorted(set(nums))
        return s[-1:-1-k:-1]
        
        
        