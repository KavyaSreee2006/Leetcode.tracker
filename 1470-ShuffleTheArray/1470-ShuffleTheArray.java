// Last updated: 07/09/2026, 14:28:11
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int [2*n];
        int j=0;
        for(int i=0;i<n;i++){
            a[j++]=nums[i];
            a[j++]=nums[i+n];
        }
        return a;
    }
}