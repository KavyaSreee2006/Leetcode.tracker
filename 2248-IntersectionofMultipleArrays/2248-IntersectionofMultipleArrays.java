// Last updated: 24/08/2026, 14:01:30
1class Solution {
2    public List<Integer> intersection(int[][] nums) {
3        List<Integer> ans = new ArrayList<>();
4        for (int i = 1; i <= 1000; i++) {
5            boolean found = true;
6            for (int j = 0; j < nums.length; j++) {
7                boolean present = false;
8                for (int k = 0; k < nums[j].length; k++) {
9                    if (nums[j][k] == i) {
10                        present = true;
11                        break;
12                    }
13                }
14                if (!present) {
15                    found = false;
16                    break;
17                }
18            }
19            if (found) {
20                ans.add(i);
21            }
22        }
23        return ans;
24    }
25}