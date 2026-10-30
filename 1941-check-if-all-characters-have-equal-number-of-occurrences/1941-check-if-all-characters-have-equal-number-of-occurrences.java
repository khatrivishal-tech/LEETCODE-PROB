class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int maxocc = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            maxocc = Math.max(maxocc , freq[ch - 'a']);
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0 && freq[i] != maxocc)
                return false;
        }
        return true;
    }
}