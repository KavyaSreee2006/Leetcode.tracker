// Last updated: 09/07/2026, 09:11:44
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0;
        int end = n - 1;

        // Standard binary search begins here
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid letter is less than or equal to target,
            // that means we need to go right (greater letters)
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                // If it's greater, it could be our answer — go left
                end = mid - 1;
            }
        }

        // start might go beyond the length of array
        // we do start % n to wrap around if needed
        return letters[start % n];
    }
}