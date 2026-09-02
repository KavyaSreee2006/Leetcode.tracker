// Last updated: 02/09/2026, 13:52:47
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        String s1="";
4        String s2="";
5        for(int i=0;i<word1.length;i++){
6            s1+=word1[i];
7        }
8        for(int i=0;i<word2.length;i++){
9            s2+=word2[i];
10        }
11        return s1.equals(s2);
12    }
13}