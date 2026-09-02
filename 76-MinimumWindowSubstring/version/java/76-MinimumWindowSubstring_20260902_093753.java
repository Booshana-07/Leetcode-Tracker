// Last updated: 9/2/2026, 9:37:53 AM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        int[] count = new int[128];
5
6        // Store characters of t
7        for (char c : t.toCharArray()) {
8            count[c]++;
9        }
10
11        int left = 0;
12        int minLength = Integer.MAX_VALUE;
13        int minStart = 0;
14
15        int required = t.length();
16
17        for (int right = 0; right < s.length(); right++) {
18
19            char rightChar = s.charAt(right);
20
21            // If this character is needed
22            if (count[rightChar] > 0) {
23                required--;
24            }
25
26            count[rightChar]--;
27
28            // When all characters of t are included
29            while (required == 0) {
30
31                // Update minimum window
32                if (right - left + 1 < minLength) {
33                    minLength = right - left + 1;
34                    minStart = left;
35                }
36
37                char leftChar = s.charAt(left);
38
39                count[leftChar]++;
40
41                // If removing this character makes the window invalid
42                if (count[leftChar] > 0) {
43                    required++;
44                }
45
46                left++;
47            }
48        }
49
50        return minLength == Integer.MAX_VALUE
51                ? ""
52                : s.substring(minStart, minStart + minLength);
53    }
54}