// Last updated: 9/8/2026, 12:03:33 PM
1class Solution {
2
3    public boolean exist(char[][] board, String word) {
4        int rows = board.length;
5        int cols = board[0].length;
6
7        // Try starting from every cell
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                if (dfs(board, word, i, j, 0)) {
11                    return true;
12                }
13            }
14        }
15
16        return false;
17    }
18
19    public boolean dfs(char[][] board, String word, int row, int col, int index) {
20
21        // Word found
22        if (index == word.length()) {
23            return true;
24        }
25
26        // Check boundaries and character match
27        if (row < 0 || row >= board.length ||
28            col < 0 || col >= board[0].length ||
29            board[row][col] != word.charAt(index)) {
30            return false;
31        }
32
33        // Mark cell as visited
34        char temp = board[row][col];
35        board[row][col] = '#';
36
37        // Check all 4 directions
38        boolean found =
39                dfs(board, word, row + 1, col, index + 1) ||
40                dfs(board, word, row - 1, col, index + 1) ||
41                dfs(board, word, row, col + 1, index + 1) ||
42                dfs(board, word, row, col - 1, index + 1);
43
44        // Restore cell (backtracking)
45        board[row][col] = temp;
46
47        return found;
48    }
49}