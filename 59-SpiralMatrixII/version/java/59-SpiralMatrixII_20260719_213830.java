// Last updated: 7/19/2026, 9:38:30 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3
4        int[][] matrix = new int[n][n];
5
6        int top = 0;
7        int bottom = n - 1;
8        int left = 0;
9        int right = n - 1;
10
11        int num = 1;
12
13        while (top <= bottom && left <= right) {
14
15            // Left -> Right
16            for (int j = left; j <= right; j++) {
17                matrix[top][j] = num++;
18            }
19            top++;
20
21            // Top -> Bottom
22            for (int i = top; i <= bottom; i++) {
23                matrix[i][right] = num++;
24            }
25            right--;
26
27            // Right -> Left
28            if (top <= bottom) {
29                for (int j = right; j >= left; j--) {
30                    matrix[bottom][j] = num++;
31                }
32                bottom--;
33            }
34
35            // Bottom -> Top
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    matrix[i][left] = num++;
39                }
40                left++;
41            }
42        }
43
44        return matrix;
45    }
46}