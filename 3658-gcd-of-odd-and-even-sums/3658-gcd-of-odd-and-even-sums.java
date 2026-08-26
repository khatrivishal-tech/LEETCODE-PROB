class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0,even=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==1){
                odd += i;
            }
            else even += i;
        }
        return gcd(odd,even);
    }
    private int gcd(int x,int y){
        if(y==0)
            return x;
        else  return gcd(y,x%y);
    }
}
