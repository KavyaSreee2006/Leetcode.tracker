// Last updated: 22/08/2026, 12:00:58
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        String res="";
4        int max=Math.max(word1.length(),word2.length());
5        for(int i=0;i<max;i++){
6            if(i<word1.length()){
7                res+=word1.charAt(i);
8            }
9            if(i<word2.length()){
10                res+=word2.charAt(i);
11            }
12        }
13        return res;
14    }
15}