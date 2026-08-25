class Solution {
    public int missingMultiple(int[] nums, int k) {
        //Arrays.sort(nums);
        int i=0;
        int result=0;
        int n=nums.length;
        int x=1;
        while(true){
            result = k*x;
            boolean found=false;
            for(int j=0;j<n;j++){
                if(nums[j]==result){
                    found=true;
                    break;
                }
            }
            if(!found){
                return result;
            }
            x++;
        }
    }
}