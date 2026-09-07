// Last updated: 07/09/2026, 14:17:48
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean increasing=true;
4        boolean decreasing=true;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]>nums[i+1]){
7                increasing = false;
8            }
9            if(nums[i]<nums[i+1]){
10                decreasing = false;
11            }
12        }
13        return increasing||decreasing;
14    }
15}