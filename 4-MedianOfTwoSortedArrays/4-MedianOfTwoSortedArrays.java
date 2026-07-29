// Last updated: 29/07/2026, 14:47:27
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int res[]=new int[n+m];
        for(int i=0;i<n;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            res[n+i]=nums2[i];
        }
        Arrays.sort(res);
        double med=0.0;
        int len=res.length;
        if(len%2!=0){
            return res[len/2];
        }
        else{
            return (res[(len/2)-1]+res[len/2])/2.0;
        }
    }
}