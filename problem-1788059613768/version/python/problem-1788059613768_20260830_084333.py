# Last updated: 8/30/2026, 8:43:33 AM
1class Solution(object):
2    def countSpecialIntegers(self, nums):
3        """
4        :type nums: List[int]
5        :rtype: int
6        """
7        ans = 0
8        for n in set(nums):
9            blocks = 0
10            for i in range(len(nums)):
11                if nums[i] == n:
12                    if i == 0 or nums[i - 1] != n:
13                        blocks += 1
14            if blocks == 1:
15                ans += 1
16        return ans