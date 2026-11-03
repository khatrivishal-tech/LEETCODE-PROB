class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        int n = words.length;
        for(int i=0;i<n;i++){
            //String word = words[i];
            if(words[i].startsWith(pref))
                cnt++;
        }
        return cnt;
    }
}