// Last updated: 8/7/2026, 9:01:31 PM
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4
5        boolean[][] palindrome = new boolean[n][n];
6        int[] dp = new int[n];
7
8        for (int i = 0; i < n; i++) {
9            dp[i] = i;
10        }
11
12        for (int end = 0; end < n; end++) {
13            for (int start = 0; start <= end; start++) {
14
15                if (s.charAt(start) == s.charAt(end) &&
16                   (end - start <= 2 || palindrome[start + 1][end - 1])) {
17
18                    palindrome[start][end] = true;
19
20                    if (start == 0)
21                        dp[end] = 0;
22                    else
23                        dp[end] = Math.min(dp[end], dp[start - 1] + 1);
24                }
25            }
26        }
27
28        return dp[n - 1];
29    }
30}