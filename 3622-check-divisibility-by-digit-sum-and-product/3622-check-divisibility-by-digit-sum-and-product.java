class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int ori=n;
        int digit=0;
        while(n>0){
            digit=n%10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        if(ori%(sum+prod)==0)
            return true;
        else return false;
    }
}