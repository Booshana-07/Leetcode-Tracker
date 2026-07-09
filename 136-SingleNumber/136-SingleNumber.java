// Last updated: 7/9/2026, 3:10:46 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++)
        {
            res=res^nums[i];
        }
        return res;
    }
}