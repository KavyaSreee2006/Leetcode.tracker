// Last updated: 01/09/2026, 13:51:40
1class Solution {
2    public boolean canConstruct(String s, int k) {
3        if (s.length() < k) {
4            return false;
5        }
6        int count = 0;
7        int freq[] = new int[26];
8        for (char c : s.toCharArray()) {
9            freq[c - 'a']++;
10        }
11        for (int i = 0; i < 26; i++) {
12            if (freq[i] % 2 != 0) {
13                count++;
14            }
15        }
16        return count <= k;
17    }
18}