// Last updated: 10/1/2026, 10:08:32 AM
1
2class Solution {
3    public int candy(int[] ratings) {
4        int n = ratings.length;
5        int[] candies = new int[n];
6        for (int i = 0; i < n; i++) {
7            candies[i] = 1;
8        }
9        for (int i = 1; i < n; i++) {
10            if (ratings[i] > ratings[i - 1]) {
11                candies[i] = candies[i - 1] + 1;
12            }
13        }
14        for (int i = n - 2; i >= 0; i--) {
15            if (ratings[i] > ratings[i + 1]) {
16                candies[i] = Math.max(
17                    candies[i], candies[i + 1] + 1
18                );
19            }
20        }
21        int total = 0;
22        for (int i = 0; i < n; i++) {
23            total += candies[i];
24        }
25        return total;
26    }
27}
28