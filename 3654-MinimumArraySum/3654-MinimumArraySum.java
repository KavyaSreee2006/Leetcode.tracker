// Last updated: 29/07/2026, 14:44:18
class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {

        int n = nums.length;
        int INF = 1000000000;

        int[][][] dp = new int[n + 1][op1 + 1][op2 + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= op1; j++) {
                for (int l = 0; l <= op2; l++) {
                    dp[i][j][l] = INF;
                }
            }
        }

        dp[0][0][0] = 0;

        for (int i = 0; i < n; i++) {

            for (int a = 0; a <= op1; a++) {
                for (int b = 0; b <= op2; b++) {

                    if (dp[i][a][b] == INF)
                        continue;

                    int x = nums[i];
                    dp[i + 1][a][b] = Math.min(dp[i + 1][a][b],
                            dp[i][a][b] + x);

                    // Operation 1
                    if (a < op1) {
                        int y = (x + 1) / 2;
                        dp[i + 1][a + 1][b] = Math.min(dp[i + 1][a + 1][b],
                                dp[i][a][b] + y);
                    }

                    // Operation 2
                    if (b < op2 && x >= k) {
                        int y = x - k;
                        dp[i + 1][a][b + 1] = Math.min(dp[i + 1][a][b + 1],
                                dp[i][a][b] + y);
                    }

                    // Both operations
                    if (a < op1 && b < op2) {
                        int y = (x + 1) / 2;
                        if (y >= k) {
                            dp[i + 1][a + 1][b + 1] = Math.min(
                                    dp[i + 1][a + 1][b + 1],
                                    dp[i][a][b] + (y - k));
                        }
                        if (x >= k) {
                            y = (x - k + 1) / 2;
                            dp[i + 1][a + 1][b + 1] = Math.min(
                                    dp[i + 1][a + 1][b + 1],
                                    dp[i][a][b] + y);
                        }
                    }
                }
            }
        }

        int ans = INF;

        for (int i = 0; i <= op1; i++) {
            for (int j = 0; j <= op2; j++) {
                ans = Math.min(ans, dp[n][i][j]);
            }
        }

        return ans;
    }
}