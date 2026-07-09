// Last updated: 7/9/2026, 3:07:28 PM
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {

                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);

                int nodes = component.size();
                int edgeCount = 0;

                for (int node : component) {
                    edgeCount += graph[node].size();
                }

                edgeCount /= 2; // each edge counted twice

                if (edgeCount == nodes * (nodes - 1) / 2) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private void dfs(int node, List<Integer>[] graph,
                     boolean[] visited, List<Integer> component) {

        visited[node] = true;
        component.add(node);

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }
}