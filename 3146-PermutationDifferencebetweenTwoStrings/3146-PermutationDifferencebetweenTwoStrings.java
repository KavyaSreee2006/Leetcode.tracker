// Last updated: 01/09/2026, 13:57:45
1class Solution {
2    public int findPermutationDifference(String s, String t) {
3        int ans = 0;
4        for (int i = 0; i < s.length(); i++) {
5            for (int j = 0; j < t.length(); j++) {
6                if (s.charAt(i) == t.charAt(j)) {
7                    ans += Math.abs(i - j);
8                    break;
9                }
10            }
11        }
12        return ans;
13    }
14}