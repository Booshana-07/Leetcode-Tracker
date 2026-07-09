// Last updated: 7/9/2026, 3:11:27 PM
import java.util.*;

class Solution {

    public String getPermutation(int n, int k) {

        List<Integer> nums = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
        }

        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        k--; // Convert to 0-based index

        StringBuilder ans = new StringBuilder();

        while (!nums.isEmpty()) {

            int index = k / fact;
            ans.append(nums.get(index));

            nums.remove(index);

            if (nums.isEmpty()) {
                break;
            }

            k = k % fact;
            fact = fact / nums.size();
        }

        return ans.toString();
    }
}