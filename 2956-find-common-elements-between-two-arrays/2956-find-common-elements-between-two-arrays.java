class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt1=0,cnt2=0;
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    cnt1++;
                    break;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums2[i]==nums1[j]){
                    cnt2++;
                    break;
                }
            }
        }
        int[] ans = new int[2];
        ans[0] = cnt1;
        ans[1] = cnt2;
        return ans;
    }
}