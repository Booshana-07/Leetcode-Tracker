// Last updated: 10/8/2026, 10:06:45 AM
1class Solution {
2    public int minDepth(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6
7        Queue<TreeNode> queue = new LinkedList<>();
8        queue.offer(root);
9
10        int depth = 1;
11
12        while (!queue.isEmpty()) {
13            int size = queue.size();
14
15            for (int i = 0; i < size; i++) {
16                TreeNode node = queue.poll();
17
18                // Leaf node
19                if (node.left == null && node.right == null) {
20                    return depth;
21                }
22
23                if (node.left != null) {
24                    queue.offer(node.left);
25                }
26
27                if (node.right != null) {
28                    queue.offer(node.right);
29                }
30            }
31
32            depth++;
33        }
34
35        return depth;
36    }
37}