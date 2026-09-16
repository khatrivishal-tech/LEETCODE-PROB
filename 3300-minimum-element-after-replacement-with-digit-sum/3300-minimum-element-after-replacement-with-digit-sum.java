class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            if(nums[i]>9){
                while(nums[i]>0){
                    int digit=nums[i]%10;
                    sum = sum+digit;
                    nums[i] /= 10;
                }
                nums[i] = sum ;
            }
        }
        Arrays.sort(nums);
        return nums[0];
    }
}