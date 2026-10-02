class Solution {
    public Boolean ispal(String str){
        int size = str.length();
        int l=0,r=size-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            String s = words[i];
            if(ispal(s))
                return s;
        }
        return (String)"";
    }
}