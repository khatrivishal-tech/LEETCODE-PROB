class Solution {
    public int maxPower(String s) {
        if(s.length()==1) return 1;
        int max = 0;
        int streak=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                streak++;
            else streak=1;
            max = Math.max(streak,max);
        }
        return max;
    }
}