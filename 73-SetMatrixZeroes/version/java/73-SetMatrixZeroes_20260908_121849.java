// Last updated: 9/8/2026, 12:18:49 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        boolean firstRowZero = false;
7        boolean firstColZero = false;
8
9        // Check if first row contains 0
10        for (int j = 0; j < cols; j++) {
11            if (matrix[0][j] == 0) {
12                firstRowZero = true;
13                break;
14            }
15        }
16
17        // Check if first column contains 0
18        for (int i = 0; i < rows; i++) {
19            if (matrix[i][0] == 0) {
20                firstColZero = true;
21                break;
22            }
23        }
24
25        // Use first row and first column as markers
26        for (int i = 1; i < rows; i++) {
27            for (int j = 1; j < cols; j++) {
28                if (matrix[i][j] == 0) {
29                    matrix[i][0] = 0;
30                    matrix[0][j] = 0;
31                }
32            }
33        }
34
35        // Set rows to zero
36        for (int i = 1; i < rows; i++) {
37            if (matrix[i][0] == 0) {
38                for (int j = 1; j < cols; j++) {
39                    matrix[i][j] = 0;
40                }
41            }
42        }
43
44        // Set columns to zero
45        for (int j = 1; j < cols; j++) {
46            if (matrix[0][j] == 0) {
47                for (int i = 1; i < rows; i++) {
48                    matrix[i][j] = 0;
49                }
50            }
51        }
52
53        // Handle first row
54        if (firstRowZero) {
55            for (int j = 0; j < cols; j++) {
56                matrix[0][j] = 0;
57            }
58        }
59
60        // Handle first column
61        if (firstColZero) {
62            for (int i = 0; i < rows; i++) {
63                matrix[i][0] = 0;
64            }
65        }
66    }
67}