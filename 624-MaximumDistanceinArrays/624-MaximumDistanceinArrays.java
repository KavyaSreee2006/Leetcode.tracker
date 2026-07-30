// Last updated: 30/07/2026, 13:54:14
1class Solution {
2    public int maxDistance(List<List<Integer>> arrays) {
3        int min = arrays.get(0).get(0);
4        int max = arrays.get(0).get(arrays.get(0).size() - 1);
5        int ans = 0;
6        for (int i = 1; i < arrays.size(); i++) {
7            int first = arrays.get(i).get(0);
8            int last = arrays.get(i).get(arrays.get(i).size() - 1);
9            ans = Math.max(ans, last - min);
10            ans = Math.max(ans, max - first);
11            if (first < min)
12                min = first;
13            if (last > max)
14                max = last;
15        }
16        return ans;
17    }
18}