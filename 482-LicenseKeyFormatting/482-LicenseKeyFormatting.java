// Last updated: 11/08/2026, 14:09:50
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String str=s.replace("-","").toUpperCase();
4        StringBuilder sb=new StringBuilder();
5        int c=0;
6        for(int i=str.length()-1;i>=0;i--){
7            if(c==k){
8                sb.append('-');
9                c=0;
10            }
11            sb.append(str.charAt(i));
12            c++;
13        }
14        return sb.reverse().toString();
15    }
16}