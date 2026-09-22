// Last updated: 9/22/2026, 10:27:40 AM
1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4
5        int[] dp = new int[n + 1];
6
7        dp[0] = 1;
8
9        // First character
10        dp[1] = s.charAt(0) == '0' ? 0 : 1;
11
12        for (int i = 2; i <= n; i++) {
13
14            // Take one digit
15            if (s.charAt(i - 1) != '0') {
16                dp[i] += dp[i - 1];
17            }
18
19            // Take two digits
20            int num = Integer.parseInt(s.substring(i - 2, i));
21
22            if (num >= 10 && num <= 26) {
23                dp[i] += dp[i - 2];
24            }
25        }
26
27        return dp[n];
28    }
29}