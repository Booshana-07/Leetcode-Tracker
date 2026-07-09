// Last updated: 7/9/2026, 3:07:10 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minSum = 0;
        int maxSum = 0;
        for(int i = 0;i < k;i++){
            minSum += nums[i];
        }
        for(int i = nums.length - 1;i >= nums.length - k;i--){
            maxSum +=nums[i];
        }
        return Math.abs(maxSum - minSum);
    }
}