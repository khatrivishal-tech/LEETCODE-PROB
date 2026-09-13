class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] l = new int[n];
        int[] r = new int[n];
        l[0]=0;
        r[n-1]=0;
        int i;
        for(i=1;i<n;i++){
            l[i] = nums[i-1]+l[i-1];
        }
        for(i=n-2;i>=0;i--){
            r[i] = nums[i+1] + r[i+1];
        }
        for(i=0;i<n;i++){
            ans[i]=Math.abs(l[i]-r[i]);
        }
        return ans;

    }
}