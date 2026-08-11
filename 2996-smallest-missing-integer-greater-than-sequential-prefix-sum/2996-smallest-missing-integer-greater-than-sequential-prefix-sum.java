class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]-1){
                sum=sum+nums[i];
            }
            else break;
        }
        boolean found=true;
        while(found){
            found=false;
            for(int i=0;i<n;i++){
                if(nums[i]==sum){
                    sum++;
                    found=true;
                    break;
                }
            }
        }
        return sum;
    }
}