// Last updated: 09/07/2026, 09:11:58

    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] idxArr=new int[11111];
        for(int i=0;i<m;i++){
            idxArr[nums2[i]]=i; 
        }
        for(int i=0;i<n;i++){
            nums1[i]=greatest(nums2,idxArr[nums1[i]]);
        }
        return nums1;
    }
    int greatest(int[] nums2,int idx){
        int m=nums2.length;
        for(int i=idx;i<m;i++){
            if(nums2[i]>nums2[idx]){
                return nums2[i];
            }
        }
        return -1;
    }
}