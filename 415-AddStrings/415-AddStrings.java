// Last updated: 31/08/2026, 14:02:33
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i = num1.length() - 1;
4        int j = num2.length() - 1;
5        int carry = 0;
6        String ans = "";
7        while (i >= 0 || j >= 0 || carry > 0) {
8            int a = 0;
9            int b = 0;
10            if (i >= 0)
11                a = num1.charAt(i) - '0';
12            if (j >= 0)
13                b = num2.charAt(j) - '0';
14            int sum = a + b + carry;
15            ans = (sum % 10) + ans;
16            carry = sum / 10;
17            i--;
18            j--;
19        }
20        return ans;
21    }
22}