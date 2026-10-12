class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int prevprod=Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //int prod = nums[i]*nums[j];
                if(nums[i]>nums[j] && nums[i]+nums[j]==target){
                    int prod = nums[i]*nums[j];
                    if(prod > prevprod){
                        prevprod = prod;
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
        } 
        return ans;
    }
}