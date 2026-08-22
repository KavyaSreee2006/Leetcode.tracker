// Last updated: 22/08/2026, 13:47:07
1class Solution {
2    public int countVowelStrings(int n) {
3        int ans = 1;
4
5        for (int i = 1; i <= 4; i++) {
6            ans = ans * (n + i) / i;
7        }
8
9        return ans;
10    }
11}