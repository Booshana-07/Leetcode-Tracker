// Last updated: 7/9/2026, 3:07:00 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for(int i=n-1; i >= n-k; i--){
            if(mul > 1){
                ans += (long)nums[i] * mul;
            }else{
                ans += nums[i];
            }
            mul--;
        }
        return ans;
    }
}