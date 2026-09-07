// Last updated: 07/09/2026, 14:27:28
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            boolean found = true;
            for (int j = 0; j < nums.length; j++) {
                boolean present = false;
                for (int k = 0; k < nums[j].length; k++) {
                    if (nums[j][k] == i) {
                        present = true;
                        break;
                    }
                }
                if (!present) {
                    found = false;
                    break;
                }
            }
            if (found) {
                ans.add(i);
            }
        }
        return ans;
    }
}