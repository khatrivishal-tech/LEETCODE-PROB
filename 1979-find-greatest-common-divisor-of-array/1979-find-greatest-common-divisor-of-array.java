class Solution {
    public int gcd(int x , int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>max)
                max = nums[i];
            if(nums[i]<min)
                min = nums[i];
        }
        return gcd(min,max);
    }
}