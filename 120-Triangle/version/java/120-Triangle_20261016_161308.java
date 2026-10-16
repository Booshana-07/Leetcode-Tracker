// Last updated: 10/16/2026, 4:13:08 PM
1
2import java.util.*;
3
4class Solution {
5    public int minimumTotal(List<List<Integer>> triangle) {
6        int n = triangle.size();
7
8        int[] dp = new int[n];
9
10        for (int i = 0; i < n; i++) {
11            dp[i] = triangle.get(n - 1).get(i);
12        }
13
14        for (int i = n - 2; i >= 0; i--) {
15            for (int j = 0; j <= i; j++) {
16                dp[j] = triangle.get(i).get(j)
17                       + Math.min(dp[j], dp[j + 1]);
18            }
19        }
20
21        return dp[0];
22    }
23}
24