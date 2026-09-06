class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
        }
        int x=n-1;
        int y=0;
        int cnt=0;
        while(x>=y){
            cnt += (arr[x]-arr[y])/2;
            x--;
            y++;
        }
        return cnt;
    }
}