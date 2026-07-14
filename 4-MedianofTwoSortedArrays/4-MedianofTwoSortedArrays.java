// Last updated: 14/07/2026, 12:11:42
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int res[]=new int[n+m];
6        for(int i=0;i<n;i++){
7            res[i]=nums1[i];
8        }
9        for(int i=0;i<m;i++){
10            res[n+i]=nums2[i];
11        }
12        Arrays.sort(res);
13        double med=0.0;
14        int len=res.length;
15        if(len%2!=0){
16            return res[len/2];
17        }
18        else{
19            return (res[(len/2)-1]+res[len/2])/2.0;
20        }
21    }
22}