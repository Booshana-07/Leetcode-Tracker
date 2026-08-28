// Last updated: 8/28/2026, 9:03:31 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        // First row
8        for (int j = 1; j < n; j++) {
9            grid[0][j] += grid[0][j - 1];
10        }
11
12        // First column
13        for (int i = 1; i < m; i++) {
14            grid[i][0] += grid[i - 1][0];
15        }
16
17        // Fill the remaining cells
18        for (int i = 1; i < m; i++) {
19            for (int j = 1; j < n; j++) {
20                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
21            }
22        }
23
24        return grid[m - 1][n - 1];
25    }
26}