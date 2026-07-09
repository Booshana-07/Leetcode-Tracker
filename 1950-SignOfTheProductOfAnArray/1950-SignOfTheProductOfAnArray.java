// Last updated: 7/9/2026, 3:08:04 PM
class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;
        for(int i : nums){
            if(i == 0)return 0;
            if(i < 0){
                pro *= -1;
            }
        }
        return (pro > 0)? 1:-1;
    }
}