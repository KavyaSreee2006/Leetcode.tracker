// Last updated: 22/08/2026, 16:08:23
1class Solution {
2    public int countVowelStrings(int n) {
3        int ans = 1;
4        for (int i = 1; i <= 4; i++) {
5            ans = ans * (n + i) / i;
6        }
7        return ans;
8    }
9}