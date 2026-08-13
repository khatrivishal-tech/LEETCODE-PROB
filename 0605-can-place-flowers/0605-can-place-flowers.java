class Solution {
    public boolean canPlaceFlowers(int[] arr, int x) {
        int n=arr.length;
        for(int i=0;i<n && x>0;i++){
            if((i==0||arr[i-1]==0)&& arr[i]==0&& (i==n-1||arr[i+1]==0)){
                arr[i]=1;
                x--;
            }
        }
        if(x==0) return true;
        else return false;
    }
}   