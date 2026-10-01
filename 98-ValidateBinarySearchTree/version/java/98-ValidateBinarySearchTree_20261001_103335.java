// Last updated: 10/1/2026, 10:33:35 AM
1
2class Solution {
3    public boolean isValidBST(TreeNode root) {
4        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
5    }
6
7    private boolean check(TreeNode node, long min, long max) {
8        if (node == null) {
9            return true;
10        }
11        if (node.val <= min || node.val >= max) {
12            return false;
13        }
14        return check(node.left, min, node.val)
15            && check(node.right, node.val, max);
16    }
17}
18