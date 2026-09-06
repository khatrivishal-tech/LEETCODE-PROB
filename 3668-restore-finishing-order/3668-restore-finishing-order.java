class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int x = order.length;
        int y = friends.length;
        int ans[] = new int[y];
        int ansidx=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(order[i]==friends[j]){
                    ans[ansidx]=friends[j];
                    ansidx++;
                }
            }
        } 
        return ans;
    }
}