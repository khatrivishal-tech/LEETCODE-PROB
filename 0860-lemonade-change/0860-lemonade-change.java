class Solution {
    public boolean lemonadeChange(int[] bills) {
       int n=bills.length;
        int five=0;
        int ten=0;
        for(int i=0;i<n;i++){
            int val = bills[i];
            if(val==5)
                five++;
            else if(val==10){
                if(five>=1){
                    five--;
                    ten++;
                }
                else return false;
            }
            else if(val==20){
                if(five>=1&&ten>=1){
                    five--;
                    ten--;
                }
                else if(five>=3)
                        five =five-3;
                else return false;
            }
        }
        return true;
    }
}