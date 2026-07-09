// Last updated: 7/9/2026, 3:07:58 PM
class Solution {
    public int countPaths(int n, int[][] roads) {
        int MOD = 1_000_000_007;

        List<List<long[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int time = road[2];

            adj.get(u).add(new long[]{v, time});
            adj.get(v).add(new long[]{u, time});
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        long[] ways = new long[n];

        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));

        dist[0] = 0;
        ways[0] = 1;
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();

            int node = (int) curr[0];
            long d = curr[1];

            if (d > dist[node]) continue;

            for (long[] neighbor : adj.get(node)) {
                int next = (int) neighbor[0];
                long wt = neighbor[1];

                long newDist = d + wt;

                if (newDist < dist[next]) {
                    dist[next] = newDist;
                    ways[next] = ways[node];
                    pq.offer(new long[]{next, newDist});
                } else if (newDist == dist[next]) {
                    ways[next] = (ways[next] + ways[node]) % MOD;
                }
            }
        }

        return (int) ways[n - 1];
    }
}