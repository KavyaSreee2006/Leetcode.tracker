// Last updated: 14/07/2026, 11:44:31
1class Solution {
2    public int reverseBits(int n) {
3        int res=0;
4        for(int i=0;i<32;i++){
5            int bit=n & 1;
6            res=(res << 1)|bit;
7            n=n >>> 1;
8        }
9        return res;
10    }
11}