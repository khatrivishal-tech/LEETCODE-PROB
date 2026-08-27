class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int odd = 0;
        int even = 0;
        for(int  i=0;i<n;i++){
            int digit = num.charAt(i)-'0';
            if(i%2==1){
                odd += digit;
            }
            else even += digit;
        }
        return odd==even;
    }
}