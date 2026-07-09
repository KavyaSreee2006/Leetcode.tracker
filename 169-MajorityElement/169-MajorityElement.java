// Last updated: 09/07/2026, 09:12:52
class Solution {
    public int majorityElement(int[] nums) {
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            a=nums[i];
            int c=0;
            for(int j=i+1;j<n;j++){
                if(a==nums[j]){
                    c++;
                }
            }
            if(c>=n/2){
                return a;
            }
        }
        return -1;
    }
}