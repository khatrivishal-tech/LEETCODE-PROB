class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int i;
        int posidx=0;
        int negidx=1;
        for(i=0;i<n;i++){
            if(nums[i]>0){
                ans[posidx]=nums[i];
                posidx += 2;
            }
            if(nums[i]<0){
                ans[negidx]=nums[i];
                negidx += 2;
            }
        }
        return ans;
    }
}