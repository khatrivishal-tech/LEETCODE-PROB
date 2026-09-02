class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int num=num1;num<=num2;num++){
            ans=ans+waviness(num);
        }
        return ans;
    }
    private int waviness(int x){
        String s = Integer.toString(x);
        int count=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i-1)&&s.charAt(i)>s.charAt(i+1)
            || s.charAt(i)<s.charAt(i-1)&&s.charAt(i)<s.charAt(i+1)){
                count++;
            }
            
        }
        return count;
    }
}