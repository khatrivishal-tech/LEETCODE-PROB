class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int ans=0;
        int prevcnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    cnt++;
                }
            }
            if(prevcnt < cnt){
                prevcnt = cnt;
            }
        }
        return prevcnt+1;
    }
}