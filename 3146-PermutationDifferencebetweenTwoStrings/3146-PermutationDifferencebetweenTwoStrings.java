// Last updated: 01/09/2026, 13:57:27
1class Solution {
2    public int findPermutationDifference(String s, String t) {
3        int ans = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            for (int j = 0; j < t.length(); j++) {
7                if (s.charAt(i) == t.charAt(j)) {
8                    ans += Math.abs(i - j);
9                    break;
10                }
11            }
12        }
13
14        return ans;
15    }
16}