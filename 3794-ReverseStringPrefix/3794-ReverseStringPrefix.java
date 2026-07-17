// Last updated: 17/07/2026, 11:46:08
1class Solution {
2    public String reversePrefix(String s, int k) {
3        String a=new StringBuilder(s.substring(0,k)).reverse().toString();
4        String a1=s.substring(k);
5        return a+a1;
6    }
7}