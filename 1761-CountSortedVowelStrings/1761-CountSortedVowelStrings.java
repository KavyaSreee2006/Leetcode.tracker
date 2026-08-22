// Last updated: 22/08/2026, 15:58:03
class Solution {
    public int countVowelStrings(int n) {
        int ans = 1;

        for (int i = 1; i <= 4; i++) {
            ans = ans * (n + i) / i;
        }

        return ans;
    }
}