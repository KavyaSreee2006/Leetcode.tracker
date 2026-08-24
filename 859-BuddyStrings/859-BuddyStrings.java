// Last updated: 24/08/2026, 13:47:28
1class Solution {
2    public boolean buddyStrings(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        int first = -1;
7        int second = -1;
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) != goal.charAt(i)) {
10                if (first == -1) {
11                    first = i;
12                } else if (second == -1) {
13                    second = i;
14                } else {
15                    return false;
16                }
17            }
18        }
19        if (first == -1) {
20            int[] count = new int[26];
21
22            for (char c : s.toCharArray()) {
23                count[c - 'a']++;
24                if (count[c - 'a'] >= 2) {
25                    return true;
26                }
27            }
28
29            return false;
30        }
31        if (second == -1) {
32            return false;
33        }
34
35        return s.charAt(first) == goal.charAt(second)
36            && s.charAt(second) == goal.charAt(first);
37    }
38}