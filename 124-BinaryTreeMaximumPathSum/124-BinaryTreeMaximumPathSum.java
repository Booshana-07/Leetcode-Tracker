// Last updated: 7/9/2026, 3:10:52 PM
class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        max = Math.max(max, left + right + node.val);

        return node.val + Math.max(left, right);
    }
}