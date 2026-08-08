class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int num=x;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        if(divi(x,sum)){
            return sum;
        }
        return -1;
    }
        private boolean divi(int a,int b){
            return a%b==0;
        }
}