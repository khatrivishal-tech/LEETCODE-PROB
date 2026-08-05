class Solution {
    public boolean isHappy(int n) {
       
       int ans=0;
       while(ans!=1&&ans!=4){
            int num=0;
            while(n>0){
                int digit=n%10;
                num=num+(digit*digit);
                n=n/10;
            }
            n=num;
            ans=num;
       }
       return ans==1;
    }
}