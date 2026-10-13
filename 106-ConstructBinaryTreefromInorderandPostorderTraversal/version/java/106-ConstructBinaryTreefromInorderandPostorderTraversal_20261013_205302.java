// Last updated: 10/13/2026, 8:53:02 PM
1
2import java.util.*;
3
4class Solution {
5    int postIndex;
6    Map<Integer, Integer> map = new HashMap<>();
7
8    public TreeNode buildTree(int[] inorder, int[] postorder) {
9        postIndex = postorder.length - 1;
10
11        for (int i = 0; i < inorder.length; i++) {
12            map.put(inorder[i], i);
13        }
14
15        return build(inorder, postorder, 0, inorder.length - 1);
16    }
17
18    private TreeNode build(int[] inorder, int[] postorder,
19                           int left, int right) {
20        if (left > right) {
21            return null;
22        }
23
24        int value = postorder[postIndex--];
25        TreeNode root = new TreeNode(value);
26
27        int mid = map.get(value);
28
29        root.right = build(inorder, postorder, mid + 1, right);
30        root.left = build(inorder, postorder, left, mid - 1);
31
32        return root;
33    }
34}
35