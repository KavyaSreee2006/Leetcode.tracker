// Last updated: 07/09/2026, 14:27:55
class Solution {
    public int countVowelStrings(int n) {
        int ans = 1;
        for (int i = 1; i <= 4; i++) {
            ans = ans * (n + i) / i;
        }
        return ans;
    }
}