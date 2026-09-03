// Last updated: 03/09/2026, 14:23:13
1class Solution {
2    public List<String> splitWordsBySeparator(List<String> words, char separator) {
3        List<String> ans = new ArrayList<>();
4        for (String word : words) {
5            String[] parts = word.split("\\" + separator);
6            for (String part : parts) {
7                if (!part.equals("")) {
8                    ans.add(part);
9                }
10            }
11        }
12        return ans;
13    }
14}