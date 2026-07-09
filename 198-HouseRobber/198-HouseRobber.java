// Last updated: 7/9/2026, 3:10:04 PM
class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = h(nums, n-1,dp);
        return ans;
    }
    private int h(int[] nums,int i,int[] dp){
        if(i<0) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + h(nums, i-2, dp);
        int skip = h(nums,i-1,dp);
        dp[i] = Math.max(take, skip);
        return dp[i];
    }
}