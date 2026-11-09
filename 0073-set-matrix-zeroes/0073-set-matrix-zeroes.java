class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] copy = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copy[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(copy[i][j]==0){
                    int r = 0 , c= 0;
                    while(r<n){
                        matrix[r][j]=0;
                        r++;
                    }
                    while(c<m){
                        matrix[i][c]=0;
                        c++;
                    }
                }
            }
        }
    }
}