// Last updated: 13/07/2026, 11:17:42
1class Solution {
2    public int alternateDigitSum(int n) {
3        String s=String.valueOf(n);
4        int sum=0;
5        for(int i=0;i<s.length();i++){
6            int digit=s.charAt(i)-'0';
7            if(i%2==0){
8                sum+=digit;
9            }
10            else{
11                sum-=digit;
12            }
13        }
14        return sum;
15    }
16}