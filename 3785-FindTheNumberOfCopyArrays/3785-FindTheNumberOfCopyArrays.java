// Last updated: 22/08/2026, 15:57:06
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        long low = Long.MIN_VALUE;
        long high = Long.MAX_VALUE;
        for (int i = 0; i < original.length; i++) {
            long diff = (long) original[i] - original[0];
            low = Math.max(low, (long) bounds[i][0] - diff);
            high = Math.min(high, (long) bounds[i][1] - diff);
        }
        if (high < low)
            return 0;
        return (int) (high - low + 1);
    }
}