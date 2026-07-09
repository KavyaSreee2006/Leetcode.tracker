// Last updated: 09/07/2026, 09:12:38
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int check=(n-1) & n;
        return check==0;
    }
}