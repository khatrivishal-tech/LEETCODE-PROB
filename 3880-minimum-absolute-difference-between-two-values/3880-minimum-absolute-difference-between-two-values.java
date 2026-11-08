class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==1&&nums[j]==2){
                    arr.add(Math.abs(i-j));
                }
            }
        }
        if(arr.size()==0) return -1;
        else
        return Collections.min(arr);
    }
}