// Last updated: 9/8/2026, 12:36:33 PM
1import java.util.*;
2
3class Solution {
4
5    public List<String> restoreIpAddresses(String s) {
6        List<String> result = new ArrayList<>();
7        backtrack(s, 0, 0, "", result);
8        return result;
9    }
10
11    private void backtrack(String s, int index, int parts, 
12                           String current, List<String> result) {
13
14        // If 4 parts are formed
15        if (parts == 4) {
16            if (index == s.length()) {
17                result.add(current.substring(0, current.length() - 1));
18            }
19            return;
20        }
21
22        // Each IP part can have 1 to 3 digits
23        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
24
25            String part = s.substring(index, index + len);
26
27            if (isValid(part)) {
28                backtrack(
29                    s,
30                    index + len,
31                    parts + 1,
32                    current + part + ".",
33                    result
34                );
35            }
36        }
37    }
38
39    private boolean isValid(String part) {
40
41        // No leading zeros
42        if (part.length() > 1 && part.charAt(0) == '0') {
43            return false;
44        }
45
46        int num = Integer.parseInt(part);
47
48        return num >= 0 && num <= 255;
49    }
50}