// Last updated: 7/25/2026, 9:02:52 PM
1class Solution {
2    public boolean isNumber(String s) {
3
4        boolean digit = false;
5        boolean dot = false;
6        boolean exponent = false;
7        boolean digitAfterExponent = true;
8
9        for (int i = 0; i < s.length(); i++) {
10
11            char ch = s.charAt(i);
12
13            // Digit
14            if (ch >= '0' && ch <= '9') {
15                digit = true;
16
17                if (exponent) {
18                    digitAfterExponent = true;
19                }
20            }
21
22            // + or -
23            else if (ch == '+' || ch == '-') {
24                // Sign is allowed only at the beginning
25                // or immediately after e/E
26                if (i != 0 &&
27                    s.charAt(i - 1) != 'e' &&
28                    s.charAt(i - 1) != 'E') {
29                    return false;
30                }
31            }
32
33            // Decimal point
34            else if (ch == '.') {
35                // Only one dot, and dot cannot come after exponent
36                if (dot || exponent) {
37                    return false;
38                }
39
40                dot = true;
41            }
42
43            // Exponent
44            else if (ch == 'e' || ch == 'E') {
45                // Only one exponent and digits must exist before it
46                if (exponent || !digit) {
47                    return false;
48                }
49
50                exponent = true;
51                digitAfterExponent = false;
52            }
53
54            // Any English letter other than e/E
55            else {
56                return false;
57            }
58        }
59
60        return digit && digitAfterExponent;
61    }
62}