// Last updated: 7/9/2026, 3:10:00 PM
import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    ans++;

                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;

                    int[][] dir = {
                        {-1, 0}, 
                        {1, 0}, 
                        {0, -1},
                        {0, 1}  
                    };

                    while (q.size() > 0) {
                        int[] curr = q.poll();

                        int x = curr[0];
                        int y = curr[1];

                        for (int k = 0; k < 4; k++) {
                            int nextRow = x + dir[k][0];
                            int nextCol = y + dir[k][1];

                            if (nextRow >= 0 && nextRow < m &&
                                nextCol >= 0 && nextCol < n &&
                                grid[nextRow][nextCol] == '1' &&
                                !visited[nextRow][nextCol]) {

                                visited[nextRow][nextCol] = true;
                                q.add(new int[]{nextRow, nextCol});
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }
}