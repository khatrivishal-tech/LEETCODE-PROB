class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int n=player1.length;
        int sum1 = 0;
        int sum2 = 0;
        sum1 += player1[0];
        sum2 += player2[0];
        for(int i=n-1;i>=1;i--){
            if(i>1){
                if(player1[i-1]==10 || player1[i-2] == 10)
                    sum1 += player1[i]*2;
                else sum1 += player1[i];

                if(player2[i-1]==10 || player2[i-2] == 10)
                    sum2 += player2[i]*2;
                else sum2 += player2[i];
            }
            else if(i==1){
                if(player1[i-1]==10)
                    sum1 += player1[i]*2;
                else sum1 += player1[i];
                if(player2[i-1]==10)
                    sum2 += player2[i]*2;
                else sum2 += player2[i];
            }

        }
        if(sum1>sum2) return 1;
        else if(sum2>sum1) return 2;
        else return 0;
    }
}