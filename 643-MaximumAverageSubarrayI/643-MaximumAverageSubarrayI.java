// Last updated: 29/07/2026, 16:08:40
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int s=0;
4        for(int i=0;i<k;i++){
5            s+=nums[i];
6        }
7        int ms=s;
8        for(int i=k;i<nums.length;i++){
9            s=s-nums[i-k]+nums[i];
10        if(s>ms){
11            ms=s;
12        }
13        }
14        return (double)ms/k;
15    }
16}