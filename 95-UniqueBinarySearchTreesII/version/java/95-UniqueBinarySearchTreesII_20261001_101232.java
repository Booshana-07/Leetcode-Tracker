// Last updated: 10/1/2026, 10:12:32 AM
1
2import java.util.*;
3
4class Solution {
5    public List<TreeNode> generateTrees(int n) {
6        return build(1, n);
7    }
8
9    private List<TreeNode> build(int start, int end) {
10        List<TreeNode> result = new ArrayList<>();
11        if (start > end) {
12            result.add(null);
13            return result;
14        }
15        for (int i = start; i <= end; i++) {
16            List<TreeNode> leftTrees = build(start, i - 1);
17            List<TreeNode> rightTrees = build(i + 1, end);
18            for (TreeNode left : leftTrees) {
19                for (TreeNode right : rightTrees) {
20                    TreeNode root = new TreeNode(i);
21                    root.left = left;
22                    root.right = right;
23                    result.add(root);
24                }
25            }
26        }
27
28        return result;
29    }
30}
31