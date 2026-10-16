// Last updated: 10/16/2026, 4:14:05 PM
1
2class Solution {
3    public Node cloneGraph(Node node) {
4        if (node == null) {
5            return null;
6        }
7
8        HashMap<Node, Node> map = new HashMap<>();
9        return dfs(node, map);
10    }
11
12    private Node dfs(Node node, HashMap<Node, Node> map) {
13        if (map.containsKey(node)) {
14            return map.get(node);
15        }
16
17        Node clone = new Node(node.val);
18        map.put(node, clone);
19
20        for (Node neighbor : node.neighbors) {
21            clone.neighbors.add(dfs(neighbor, map));
22        }
23
24        return clone;
25    }
26}
27