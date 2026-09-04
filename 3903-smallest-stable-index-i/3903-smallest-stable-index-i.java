class Solution {
    private int findMax(int[] arr,int l ,int r){
        int max=arr[l];
        for(int i=l;i<=r;i++){
            if(arr[i]>max)  max=arr[i];
        }
        return max;
    }
    private int findMin(int[] arr , int l ,int r){
        int min=arr[l];
        for(int i=l;i<=r;i++){
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max , min;
        int score  = 0;
        for(int i=0;i<n;i++){
            max=findMax(nums,0,i);
            min=findMin(nums,i,n-1);
            score = max - min;
            if(score <= k) return i;
        }
        return -1;
    }
}