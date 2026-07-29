// Last updated: 29/07/2026, 14:44:21
class Solution {
    public String reversePrefix(String s, int k) {
        String a=new StringBuilder(s.substring(0,k)).reverse().toString();
        String a1=s.substring(k);
        return a+a1;
    }
}