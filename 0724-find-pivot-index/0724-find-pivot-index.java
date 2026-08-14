class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int pivot=0;pivot<n;pivot++){
            int i=0,j=pivot+1;
            int l=0,r=0;
            while(i<pivot){
                l += nums[i];
                i++;
            }
            while(j<n){
                r += nums[j];
                j++;
            }
            if(l==r)
                return pivot;
        }
        return -1;
    }
}