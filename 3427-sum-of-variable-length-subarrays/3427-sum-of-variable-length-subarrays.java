class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int start=0;
        int wholesum=nums[0];
        for(int i=1;i<n;i++){
            int sum=0;
            start = Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                sum=sum+nums[j];
            }
            wholesum += sum;
        }
        return wholesum;
    }
}