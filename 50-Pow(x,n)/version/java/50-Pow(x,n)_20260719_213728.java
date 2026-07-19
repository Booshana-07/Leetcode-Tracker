// Last updated: 7/19/2026, 9:37:28 PM
1class Solution {
2    public double myPow(double x, int n) {
3
4        long N = n; // handle Integer.MIN_VALUE
5
6        if (N < 0) {
7            x = 1 / x;
8            N = -N;
9        }
10
11        double ans = 1.0;
12
13        while (N > 0) {
14
15            if (N % 2 == 1) {
16                ans *= x;
17            }
18
19            x *= x;
20            N /= 2;
21        }
22
23        return ans;
24    }
25}