// Last updated: 09/07/2026, 09:11:26
class Solution {
    public boolean checkIfExist(int[] arr) {
        int zeros = 0;
        boolean[] set = new boolean[2001];
        for (int i: arr) {
            if (i == 0) {
                zeros++;
                if (zeros > 1) {
                    return true;
                }
            } else {
                set[i + 1000] = true;
            }
        }

        for (int i: arr) {
            int d = i * 2 + 1000; 

            if (d >= 0 && d <= 2000 && set[d]) {
                return true;
            }
        }

        return false;
    }
}