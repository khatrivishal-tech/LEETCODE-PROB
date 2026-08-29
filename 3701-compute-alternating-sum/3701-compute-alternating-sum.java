class Solution {
    public int alternatingSum(int[] nums) {
        int n = nums.length;
        int i;
        int sum=0;
        for(i=0;i<n;i++){
            if(i%2==0){
                sum = sum + nums[i];
            }
            else sum = sum - nums[i];
        }
        return sum;
    }
}