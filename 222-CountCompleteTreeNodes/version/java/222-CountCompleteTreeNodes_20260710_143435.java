// Last updated: 7/10/2026, 2:34:35 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    public int countNodes(TreeNode root) {
19
20        if (root == null)
21            return 0;
22
23        int leftHeight = leftHeight(root);
24        int rightHeight = rightHeight(root);
25
26        if (leftHeight == rightHeight) {
27            return (1 << leftHeight) - 1;
28        }
29
30        return 1 + countNodes(root.left) + countNodes(root.right);
31    }
32
33    private int leftHeight(TreeNode node) {
34
35        int height = 0;
36
37        while (node != null) {
38            height++;
39            node = node.left;
40        }
41
42        return height;
43    }
44
45    private int rightHeight(TreeNode node) {
46
47        int height = 0;
48
49        while (node != null) {
50            height++;
51            node = node.right;
52        }
53
54        return height;
55    }
56}