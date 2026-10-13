// Last updated: 10/13/2026, 8:59:35 PM
1
2import java.util.*;
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5        int n = nums.length;
6        int[] result = new int[n - k + 1];
7        Deque<Integer> deque = new ArrayDeque<>();
8        for (int i = 0; i < n; i++) {
9            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
10                deque.pollFirst();
11            }
12            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
13                deque.pollLast();
14            }
15            deque.offerLast(i);
16            if (i >= k - 1) {
17                result[i - k + 1] = nums[deque.peekFirst()];
18            }
19        }
20        return result;
21    }
22}
23