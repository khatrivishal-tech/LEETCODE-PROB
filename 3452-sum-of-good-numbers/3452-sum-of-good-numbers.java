class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            if((i-k<0 || nums[i]>nums[i-k]) && (i+k>=n || nums[i]>nums[i+k]))
                ans += nums[i]; 
        }
        return ans;
    }
}