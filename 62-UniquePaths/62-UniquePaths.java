// Last updated: 7/9/2026, 3:11:25 PM
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        int ans = a(0,0,m,n,dp);
        return ans;
    }
    private int a(int i,int j,int m,int n,int[][] dp){
        if(i >= m || j >=n) return 0;
        if(i == m - 1 && j == n- 1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int x = a(i+1,j,m,n,dp);
        int y = a(i,j+1,m,n,dp);
        dp[i][j] = x+y;
        return dp[i][j];
    }
}