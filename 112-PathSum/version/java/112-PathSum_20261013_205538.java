// Last updated: 10/13/2026, 8:55:38 PM
1
2class Solution {
3    public boolean hasPathSum(TreeNode root, int targetSum) {
4        if (root == null) {
5            return false;
6        }
7        if (root.left == null && root.right == null) {
8            return targetSum == root.val;
9        }
10        int remainingSum = targetSum - root.val;
11        return hasPathSum(root.left, remainingSum)
12            || hasPathSum(root.right, remainingSum);
13    }
14}
15