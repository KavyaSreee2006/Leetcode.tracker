// Last updated: 24/08/2026, 14:19:05
1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3
4        Set<Integer> s1 = new HashSet<>();
5        Set<Integer> s2 = new HashSet<>();
6
7        for (int n : nums1)
8            s1.add(n);
9
10        for (int n : nums2)
11            s2.add(n);
12
13        List<Integer> a = new ArrayList<>();
14        List<Integer> b = new ArrayList<>();
15
16        for (int n : s1) {
17            if (!s2.contains(n))
18                a.add(n);
19        }
20
21        for (int n : s2) {
22            if (!s1.contains(n))
23                b.add(n);
24        }
25
26        return Arrays.asList(a, b);
27    }
28}