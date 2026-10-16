// Last updated: 10/16/2026, 4:12:00 PM
1
2import java.util.*;
3
4class Solution {
5    public List<Integer> getRow(int rowIndex) {
6        List<Integer> row = new ArrayList<>();
7        row.add(1);
8
9        for (int i = 1; i <= rowIndex; i++) {
10            row.add(0);
11
12            for (int j = i; j > 0; j--) {
13                row.set(j, row.get(j) + row.get(j - 1));
14            }
15        }
16
17        return row;
18    }
19}
20