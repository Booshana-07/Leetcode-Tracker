// Last updated: 7/9/2026, 3:07:07 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums[nums.length/2];
        int count = 0;
        for(int num : nums){
            if(num == mid){
                count++;
            }
        }
        return count == 1;
    }
}