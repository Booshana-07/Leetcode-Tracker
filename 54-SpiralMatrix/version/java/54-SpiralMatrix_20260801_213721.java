// Last updated: 8/1/2026, 9:37:21 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> ans = new ArrayList<>();
6
7        int top = 0;
8        int bottom = matrix.length - 1;
9        int left = 0;
10        int right = matrix[0].length - 1;
11
12        while (top <= bottom && left <= right) {
13
14            // Left to Right
15            for (int i = left; i <= right; i++)
16                ans.add(matrix[top][i]);
17            top++;
18
19            // Top to Bottom
20            for (int i = top; i <= bottom; i++)
21                ans.add(matrix[i][right]);
22            right--;
23
24            // Right to Left
25            if (top <= bottom) {
26                for (int i = right; i >= left; i--)
27                    ans.add(matrix[bottom][i]);
28                bottom--;
29            }
30
31            // Bottom to Top
32            if (left <= right) {
33                for (int i = bottom; i >= top; i--)
34                    ans.add(matrix[i][left]);
35                left++;
36            }
37        }
38
39        return ans;
40    }
41}