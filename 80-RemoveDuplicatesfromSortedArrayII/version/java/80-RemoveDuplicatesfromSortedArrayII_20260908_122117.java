// Last updated: 9/8/2026, 12:21:17 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2) {
4            return nums.length;
5        }
6
7        int k = 2;
8
9        for (int i = 2; i < nums.length; i++) {
10            if (nums[i] != nums[k - 2]) {
11                nums[k] = nums[i];
12                k++;
13            }
14        }
15
16        return k;
17    }
18}