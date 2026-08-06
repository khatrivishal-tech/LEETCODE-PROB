class Solution {
    public int smallestNumber(int n, int t) {
        //int temp=n;
        while(true){
            int temp=n;
            int prod=1;
            while(temp>0){
                //int prod=1;
                int digit=temp%10;
                prod=prod*digit;
                temp=temp/10;
            }
            if(prod%t!=0)
                n++;
            else return n;
        }
        
    }
}