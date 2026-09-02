// Last updated: 02/09/2026, 14:12:28
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int s=0;
4        int m=nums[0];
5        for(int i=0;i<nums.length;i++){
6            s+=nums[i];
7            if(s>m){
8                m=s;
9            }
10            if(s<0){
11                s=0;
12            }
13        }
14        return m;
15    }
16}