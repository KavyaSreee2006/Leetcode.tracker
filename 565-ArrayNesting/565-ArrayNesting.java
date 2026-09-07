// Last updated: 07/09/2026, 13:53:31
1class Solution {
2    public int arrayNesting(int[] nums) {
3        int m=0;
4        for(int i=0;i<nums.length;i++){
5            int c=0;
6            int j=i;
7            while(nums[j]!=-1){
8               int next= nums[j];
9               nums[j]=-1;
10               j=next;
11               c++;
12            }
13            m=Math.max(c,m);
14        }
15        return m;
16    }
17}