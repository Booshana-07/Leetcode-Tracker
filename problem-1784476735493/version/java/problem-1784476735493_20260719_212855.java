// Last updated: 7/19/2026, 9:28:55 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> getSkyline(int[][] buildings) {
5
6        List<int[]> events = new ArrayList<>();
7
8        for (int[] b : buildings) {
9            events.add(new int[]{b[0], -b[2]}); // start
10            events.add(new int[]{b[1], b[2]});  // end
11        }
12
13        Collections.sort(events, (a, b) -> {
14            if (a[0] != b[0]) {
15                return Integer.compare(a[0], b[0]);
16            }
17            return Integer.compare(a[1], b[1]);
18        });
19
20        PriorityQueue<Integer> maxHeap =
21                new PriorityQueue<>(Collections.reverseOrder());
22
23        maxHeap.offer(0);
24
25        int prevHeight = 0;
26
27        List<List<Integer>> result = new ArrayList<>();
28
29        for (int[] event : events) {
30
31            int x = event[0];
32            int h = event[1];
33
34            if (h < 0) {
35                maxHeap.offer(-h);
36            } else {
37                maxHeap.remove(h);
38            }
39
40            int currHeight = maxHeap.peek();
41
42            if (currHeight != prevHeight) {
43
44                result.add(Arrays.asList(x, currHeight));
45
46                prevHeight = currHeight;
47            }
48        }
49
50        return result;
51    }
52}