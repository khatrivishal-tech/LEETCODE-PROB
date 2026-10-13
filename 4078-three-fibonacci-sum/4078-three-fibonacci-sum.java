class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0 , b = 1 , c = 1;
        int sum = a+b+c;
        if(sum == n) return true;
        int fibo=0;
        while(sum <= n){
            fibo = c+b;
            a=b;
            b=c;
            c=fibo;
            sum = a+b+c;
            if(sum == n) return true;
        }
        return false;
    }
}