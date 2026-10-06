class Solution {
    public int reverse(int num){
        int rev=0;
        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            ans[i]=reverse(nums[i-n]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<2*n;i++){
            set.add(ans[i]);
        }
        return set.size();
    }
}