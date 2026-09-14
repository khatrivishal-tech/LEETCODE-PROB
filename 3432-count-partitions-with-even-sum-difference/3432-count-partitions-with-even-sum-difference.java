class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<=i;j++){
                leftsum += nums[j];
            }
            for(int j=i+1;j<n;j++){
                rightsum += nums[j];
            }
            if(Math.abs(leftsum-rightsum)%2==0)
                cnt++;
        }
        return cnt;
    }
}