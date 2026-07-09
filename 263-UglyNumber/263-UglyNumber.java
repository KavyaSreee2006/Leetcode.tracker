// Last updated: 09/07/2026, 09:12:32
class Solution {
    public boolean isUgly(int n) {
        if(n == 0)
            return false;
            
        n = uglyChecker(n, 2);
        n = uglyChecker(n, 3);
        n = uglyChecker(n, 5);

        return n == 1;
    }
    public int uglyChecker(int num, int factor) { 
        while(num % factor == 0) 
            num /= factor; 
            
        return num; 
    }
}