class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int lar = Integer.MIN_VALUE, seclar = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE, seclow = Integer.MAX_VALUE;
        for(int i=0 ;i<n;i++){
            if(nums[i] > lar){
                seclar = lar ;
                lar = nums[i];
            }
            else if(nums[i]>seclar)
                    seclar = nums[i];

            if(nums[i]<low){
                seclow = low;
                low = nums[i];
            }
            else if(nums[i]<seclow)
                    seclow = nums[i];
        }
        return (lar * seclar) - (low * seclow);
    }
}