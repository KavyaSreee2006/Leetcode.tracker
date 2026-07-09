// Last updated: 09/07/2026, 09:13:33
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=val){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
            i++;
        }
        return j;
    }
}