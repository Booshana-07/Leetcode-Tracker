// Last updated: 8/1/2026, 9:27:28 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if (num1.equals("0") || num2.equals("0"))
4            return "0";
5
6        int m = num1.length();
7        int n = num2.length();
8        int[] res = new int[m + n];
9
10        for (int i = m - 1; i >= 0; i--) {
11            for (int j = n - 1; j >= 0; j--) {
12                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
13                int sum = mul + res[i + j + 1];
14
15                res[i + j + 1] = sum % 10;
16                res[i + j] += sum / 10;
17            }
18        }
19
20        StringBuilder ans = new StringBuilder();
21        for (int num : res) {
22            if (!(ans.length() == 0 && num == 0))
23                ans.append(num);
24        }
25
26        return ans.toString();
27    }
28}