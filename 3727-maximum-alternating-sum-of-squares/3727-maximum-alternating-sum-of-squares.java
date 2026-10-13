class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        for(int i=0;i<n;i++){
            long value = nums[i];
            ans[i] = value * value;
        }
        Arrays.sort(ans);
        long total = 0;
        for(int i=0;i<n;i++){
            if(i<n/2){
                total -= ans[i];
            }
            else total += ans[i];
        }
        return total;
    }
}