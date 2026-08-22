// Last updated: 22/08/2026, 15:59:43
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length())
            return result;
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
            b[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (Arrays.equals(a, b))
                result.add(i);
            if (i + p.length() < s.length()) {
                b[s.charAt(i) - 'a']--;
                b[s.charAt(i + p.length()) - 'a']++;
            }
        }
        return result;
    }
}