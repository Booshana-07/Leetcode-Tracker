// Last updated: 7/25/2026, 9:17:11 PM
1class Solution {
2    public void flatten(TreeNode root) {
3
4        TreeNode current = root;
5
6        while (current != null) {
7
8            if (current.left != null) {
9
10                TreeNode temp = current.left;
11
12                while (temp.right != null) {
13                    temp = temp.right;
14                }
15
16                temp.right = current.right;
17                current.right = current.left;
18                current.left = null;
19            }
20
21            current = current.right;
22        }
23    }
24}