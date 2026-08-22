// Last updated: 22/08/2026, 15:59:14
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = 0;
        for (int i = 1; i < arrays.size(); i++) {
            int first = arrays.get(i).get(0);
            int last = arrays.get(i).get(arrays.get(i).size() - 1);
            ans = Math.max(ans, last - min);
            ans = Math.max(ans, max - first);
            if (first < min)
                min = first;
            if (last > max)
                max = last;
        }
        return ans;
    }
}