// Last updated: 02/09/2026, 09:34:01
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        int count = 0;
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                count++;
            }
        }
        return count <= k;
    }
}