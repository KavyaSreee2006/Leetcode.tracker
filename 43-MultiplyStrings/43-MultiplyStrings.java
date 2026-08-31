// Last updated: 31/08/2026, 12:19:31
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0"))
4            return "0";
5        int[] arr = new int[num1.length() + num2.length()];
6        for (int i = num1.length() - 1; i >= 0; i--) {
7            for (int j = num2.length() - 1; j >= 0; j--) {
8                int a = num1.charAt(i) - '0';
9                int b = num2.charAt(j) - '0';
10                int product = a * b;
11                int p1 = i + j;
12                int p2 = i + j + 1;
13                int sum = product + arr[p2];
14                arr[p2] = sum % 10;
15                arr[p1] += sum / 10;
16            }
17        }
18        StringBuilder result = new StringBuilder();
19        for (int x : arr) {
20            if (result.length() == 0 && x == 0)
21                continue;
22            result.append(x);
23        }
24        return result.toString();
25    }
26}