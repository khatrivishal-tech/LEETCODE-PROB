class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int actualsum=(n*(n+1))/2;
        int arraysum = 0;
        for(int i=0;i<n;i++){
            arraysum += nums[i];
        } 
        //int count=1;
        int duplicate=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    duplicate=nums[j];
                    break;
                }
            }
        }
        int missing = duplicate + (actualsum-arraysum);
        return new int[]{duplicate , missing};
    }
}