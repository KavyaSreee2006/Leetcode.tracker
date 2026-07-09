// Last updated: 09/07/2026, 09:11:37
class Solution {
    public int fib(int n) {
        return F(n);
    }

    private int F(int n) {
        if (n == 0) return 0;  // base case
        if (n == 1) return 1;  // base case
        return F(n - 1) + F(n - 2); // recursive case
    }
}