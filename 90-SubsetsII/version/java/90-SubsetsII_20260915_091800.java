// Last updated: 9/15/2026, 9:18:00 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(nums);
8
9        backtrack(nums, 0, new ArrayList<>(), result);
10
11        return result;
12    }
13
14    public void backtrack(int[] nums, int start, 
15                          List<Integer> current, 
16                          List<List<Integer>> result) {
17
18        result.add(new ArrayList<>(current));
19
20        for (int i = start; i < nums.length; i++) {
21
22            // Skip duplicates
23            if (i > start && nums[i] == nums[i - 1]) {
24                continue;
25            }
26
27            current.add(nums[i]);
28
29            backtrack(nums, i + 1, current, result);
30
31            current.remove(current.size() - 1);
32        }
33    }
34}