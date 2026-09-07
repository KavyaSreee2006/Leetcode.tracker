// Last updated: 07/09/2026, 14:29:45
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[k] = nums1[i];
                    k++;

                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}