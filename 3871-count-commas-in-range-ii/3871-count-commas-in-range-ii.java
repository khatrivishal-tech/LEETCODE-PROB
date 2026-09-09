class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long i;
        long cnt=0;
        for(i=1000;i<=n;i=i*1000){
            cnt = cnt + (n-i+1);
        }
        return cnt;
    }
}