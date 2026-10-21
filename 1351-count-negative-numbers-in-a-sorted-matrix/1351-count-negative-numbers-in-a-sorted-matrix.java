class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        int x=grid.length;
        for(int i=0;i<x;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0)
                    cnt++;
            }
        }
        return cnt;
    }
}