// Last updated: 7/17/2026, 9:42:04 AM
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int m = dungeon.length;
4        int n = dungeon[0].length;
5
6        int[][] dp = new int[m][n];
7
8        dp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
9
10        for (int i = m - 2; i >= 0; i--) {
11            dp[i][n - 1] = Math.max(1,
12                    dp[i + 1][n - 1] - dungeon[i][n - 1]);
13        }
14
15        for (int j = n - 2; j >= 0; j--) {
16            dp[m - 1][j] = Math.max(1,
17                    dp[m - 1][j + 1] - dungeon[m - 1][j]);
18        }
19
20        for (int i = m - 2; i >= 0; i--) {
21            for (int j = n - 2; j >= 0; j--) {
22
23                int minHealthNeeded =
24                        Math.min(dp[i + 1][j], dp[i][j + 1]);
25
26                dp[i][j] = Math.max(
27                        1,
28                        minHealthNeeded - dungeon[i][j]
29                );
30            }
31        }
32
33        return dp[0][0];
34    }
35}