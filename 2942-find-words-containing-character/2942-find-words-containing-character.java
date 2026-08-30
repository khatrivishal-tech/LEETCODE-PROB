class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = words.length;
        for(int i=0 ; i<n;i++ ){
            char[] chararray = words[i].toCharArray();
            for(int j=0;j<words[i].length();j++){
                if(chararray[j]==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}