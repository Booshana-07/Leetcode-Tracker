// Last updated: 7/9/2026, 3:09:54 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int[] arr1 = new int[n - 1]; 
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
            arr2[i] = nums[i + 1];
        }

        int[] dp1 = new int[n - 1];

        Arrays.fill(dp1, -1);

        int ans1 = helper(arr1, arr1.length - 1, dp1);
        Arrays.fill(dp1,-1);
        int ans2 = helper(arr2, arr2.length - 1, dp1);

        return Math.max(ans1, ans2);
    }

    private int helper(int[] nums, int i, int[] dp) {
        if (i < 0) return 0;

        if (dp[i] != -1) return dp[i];

        int take = nums[i] + helper(nums, i - 2, dp);
        int skip = helper(nums, i - 1, dp);

        return dp[i] = Math.max(take,skip);
    }
}
