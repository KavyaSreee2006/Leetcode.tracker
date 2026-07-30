// Last updated: 30/07/2026, 14:29:14
1class Solution {
2    public int countArrays(int[] original, int[][] bounds) {
3        long low = Long.MIN_VALUE;
4        long high = Long.MAX_VALUE;
5        for (int i = 0; i < original.length; i++) {
6            long diff = (long) original[i] - original[0];
7            low = Math.max(low, (long) bounds[i][0] - diff);
8            high = Math.min(high, (long) bounds[i][1] - diff);
9        }
10        if (high < low)
11            return 0;
12        return (int) (high - low + 1);
13    }
14}