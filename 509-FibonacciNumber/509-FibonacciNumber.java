// Last updated: 07/09/2026, 14:28:46
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