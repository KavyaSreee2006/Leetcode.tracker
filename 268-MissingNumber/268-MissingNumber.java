// Last updated: 09/07/2026, 09:12:31
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int as=0;
        for(int i=0;i<n;i++){
             as+=nums[i];
        }
        int ans=sum-as;
        return ans;
    }
}