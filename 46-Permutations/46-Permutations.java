// Last updated: 7/9/2026, 3:11:36 PM
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        int n = nums.length;
        boolean[] used = new boolean[n];

        a(nums, ans, cur, used);
        return ans;
    }

    public void a(int[] nums, List<List<Integer>> ans,
                  List<Integer> cur, boolean[] used) {

        if (cur.size() == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            cur.add(nums[i]);
            used[i] = true;

            a(nums, ans, cur, used);

            cur.remove(cur.size() - 1);
            used[i] = false;
        }
    }
}