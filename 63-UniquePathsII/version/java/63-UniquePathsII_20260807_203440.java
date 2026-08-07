// Last updated: 8/7/2026, 8:34:40 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3
4        int m = obstacleGrid.length;
5        int n = obstacleGrid[0].length;
6
7        int[][] dp = new int[m][n];
8
9        // Start is blocked
10        if (obstacleGrid[0][0] == 1)
11            return 0;
12
13        dp[0][0] = 1;
14
15        // First column
16        for (int i = 1; i < m; i++) {
17            if (obstacleGrid[i][0] == 0)
18                dp[i][0] = dp[i - 1][0];
19        }
20
21        // First row
22        for (int j = 1; j < n; j++) {
23            if (obstacleGrid[0][j] == 0)
24                dp[0][j] = dp[0][j - 1];
25        }
26
27        // Fill remaining cells
28        for (int i = 1; i < m; i++) {
29            for (int j = 1; j < n; j++) {
30                if (obstacleGrid[i][j] == 0)
31                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
32            }
33        }
34
35        return dp[m - 1][n - 1];
36    }
37}