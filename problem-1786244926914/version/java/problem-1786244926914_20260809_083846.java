// Last updated: 8/9/2026, 8:38:46 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int n = prices.length;
6        int m = discounts.length;
7        double total = 0;
8        int i = n - 1;
9        int j = m - 1;
10        while(i >= 0 && j >= 0){
11            total += (double) prices[i] * (100 - discounts[j])/100;
12            i--;
13            j--;
14        }
15        while(i >= 0){
16            total += prices[i];
17            i--;
18        }
19        return total;
20    }
21}