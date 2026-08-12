// Last updated: 12/08/2026, 14:54:58
1class Solution {
2    public int trailingZeroes(int n) {
3        int c=0;
4        while(n>0){
5            n=n/5;
6            c+=n;
7        }
8        return c;
9    }
10}