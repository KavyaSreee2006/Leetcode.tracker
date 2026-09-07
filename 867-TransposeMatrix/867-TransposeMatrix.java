// Last updated: 07/09/2026, 14:29:00
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}