// Last updated: 22/08/2026, 11:36:00
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> result = new ArrayList<>();
4        if (s.length() < p.length())
5            return result;
6        int[] a = new int[26];
7        int[] b = new int[26];
8        for (int i = 0; i < p.length(); i++) {
9            a[p.charAt(i) - 'a']++;
10            b[s.charAt(i) - 'a']++;
11        }
12        for (int i = 0; i <= s.length() - p.length(); i++) {
13            if (Arrays.equals(a, b))
14                result.add(i);
15            if (i + p.length() < s.length()) {
16                b[s.charAt(i) - 'a']--;
17                b[s.charAt(i + p.length()) - 'a']++;
18            }
19        }
20        return result;
21    }
22}