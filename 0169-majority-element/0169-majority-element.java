class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i;
        int count=0;
        int target=0;
        for(i=0;i<n;i++){
            if(count==0)
                target=nums[i];
            if(target==nums[i])
                count++;
            else 
                count--;
        }
        return target;
    }
}