// Last updated: 7/10/2026, 2:36:08 PM
1class Solution {
2
3    int[][][] dp;
4
5    public int maxProfit(int k, int[] prices) {
6
7        int n = prices.length;
8
9        dp = new int[n][2][k + 1];
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < 2; j++) {
13                for (int t = 0; t <= k; t++) {
14                    dp[i][j][t] = -1;
15                }
16            }
17        }
18
19        return solve(0, 1, k, prices);
20    }
21
22    private int solve(int index, int buy, int cap, int[] prices) {
23
24        if (index == prices.length || cap == 0)
25            return 0;
26
27        if (dp[index][buy][cap] != -1)
28            return dp[index][buy][cap];
29
30        int profit;
31
32        if (buy == 1) {
33
34            int buyStock = -prices[index] + solve(index + 1, 0, cap, prices);
35            int skip = solve(index + 1, 1, cap, prices);
36
37            profit = Math.max(buyStock, skip);
38
39        } else {
40
41            int sellStock = prices[index] + solve(index + 1, 1, cap - 1, prices);
42            int skip = solve(index + 1, 0, cap, prices);
43
44            profit = Math.max(sellStock, skip);
45        }
46
47        return dp[index][buy][cap] = profit;
48    }
49}