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
            if(arr[x]!=arr[y]){
                arr[x] -= 1;
                arr[y] += 1;
                cnt++;
            }
            else{
            x--;
            y++;
            }
        }
        return cnt;
    }
}