// Last updated: 10/8/2026, 10:18:38 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5        while (left < right) {
6            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
7                left++;
8            }
9            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
10                right--;
11            }
12            if (Character.toLowerCase(s.charAt(left)) !=
13                Character.toLowerCase(s.charAt(right))) {
14                return false;
15            }
16            left++;
17            right--;
18        }
19        return true;
20    }
21}