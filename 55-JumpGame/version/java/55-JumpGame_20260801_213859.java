// Last updated: 8/1/2026, 9:38:59 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxReach = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > maxReach) {
7                return false;
8            }
9
10            maxReach = Math.max(maxReach, i + nums[i]);
11        }
12
13        return true;
14    }
15}