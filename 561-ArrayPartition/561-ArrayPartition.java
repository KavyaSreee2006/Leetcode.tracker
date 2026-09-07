// Last updated: 07/09/2026, 14:01:56
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int s=0;
5        for(int i=0;i<nums.length;i=i+2){
6            s+=nums[i];
7        }
8        return s;
9    }
10}