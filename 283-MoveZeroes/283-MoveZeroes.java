// Last updated: 09/07/2026, 09:12:28
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;  // Where the next non-zero goes
        for(int num : nums){
            if(num != 0) nums[index++] = num; // Slide non-zero forward
        }
        while(index < nums.length){
            nums[index++] = 0; // Fill the rest with zeros
        }
    }
}