class Solution {
    public String removeStars(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='*'){
                ans.append(s.charAt(i));
            }
            else ans.deleteCharAt(ans.length()-1);
        }
        return ans.toString();
    }
}