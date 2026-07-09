// Last updated: 09/07/2026, 09:11:10
import java.util.*;
class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {

        int[] ans = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {

            int k = queries[q][0];
            int trim = queries[q][1];

            String[][] arr = new String[nums.length][2];

            // Store trimmed number and index
            for (int i = 0; i < nums.length; i++) {
                arr[i][0] = nums[i].substring(nums[i].length() - trim);
                arr[i][1] = i + "";
            }

            // Simple bubble sort
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                    if (arr[i][0].compareTo(arr[j][0]) > 0 ||
                       (arr[i][0].equals(arr[j][0]) &&
                        Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[j][1]))) {

                        // swap trimmed number
                        String temp1 = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = temp1;

                        // swap index
                        String temp2 = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = temp2;
                    }
                }
            }

            ans[q] = Integer.parseInt(arr[k - 1][1]);
        }

        return ans;
    }
}