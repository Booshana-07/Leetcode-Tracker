// Last updated: 7/9/2026, 3:11:42 PM
import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> path,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Stop if current number is too large
            if (candidates[i] > target) {
                break;
            }

            path.add(candidates[i]);

            // Move to the next index (use each number only once)
            backtrack(candidates, target - candidates[i], i + 1, path, result);

            // Backtrack
            path.remove(path.size() - 1);
        }
    }
}