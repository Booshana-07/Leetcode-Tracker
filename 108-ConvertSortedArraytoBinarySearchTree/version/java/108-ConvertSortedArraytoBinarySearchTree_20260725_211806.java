// Last updated: 7/25/2026, 9:18:06 PM
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums, 0, nums.length - 1);
4    }
5
6    public TreeNode build(int[] nums, int left, int right) {
7
8        if (left > right) {
9            return null;
10        }
11
12        int mid = left + (right - left) / 2;
13
14        TreeNode root = new TreeNode(nums[mid]);
15
16        root.left = build(nums, left, mid - 1);
17        root.right = build(nums, mid + 1, right);
18
19        return root;
20    }
21}