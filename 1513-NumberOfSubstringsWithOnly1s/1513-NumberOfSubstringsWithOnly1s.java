// Last updated: 07/09/2026, 14:28:07
class Solution {
    public int numSub(String s) {
        long ans = 0;
        long count = 0;
        int mod = 1000000007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                ans = (ans + count) % mod;
            } else {
                count = 0;
            }

        }
        return (int) ans;
    }
}