// Last updated: 22/08/2026, 12:04:10
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        String res="";
4        int i=0;
5        while(i<word1.length() ||i<word2.length()){
6            if(i<word1.length()){
7                res+=word1.charAt(i);
8            }
9            if(i<word2.length()){
10                res+=word2.charAt(i);
11            }
12            i++;
13        }
14        return res;
15    }
16}