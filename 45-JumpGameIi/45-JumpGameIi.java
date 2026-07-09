// Last updated: 09/07/2026, 09:13:28
class Solution {
    public int jump(int[] nums) {
        int jumps=0,currend=0,currfar=0;
        for(int i=0;i<nums.length-1;i++){
            currfar=Math.max(currfar,i+nums[i]);
            if(i == currend){
                currend=currfar;
                jumps++;
            }
        }
        return jumps;
    }
}