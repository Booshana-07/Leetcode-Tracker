// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int element = 0;
        int digit = 0;
        for(int i : nums){
            element +=i;
            int n = i;
            while(n > 0){
                digit += n % 10;
                n /= 10;
            }
        }
        return Math.abs(element - digit);
    }
}