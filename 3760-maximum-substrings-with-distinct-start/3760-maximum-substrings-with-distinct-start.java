class Solution {
    public int maxDistinct(String s) {
        int n=s.length();
        HashSet<Character> list = new HashSet<>();
        for(int i=0;i<n;i++){
            list.add(s.charAt(i));
        }
        return list.size();
    }
}