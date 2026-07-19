// Last updated: 7/19/2026, 9:26:14 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3
4        String rev = new StringBuilder(s).reverse().toString();
5
6        String temp = s + "#" + rev;
7
8        int[] lps = new int[temp.length()];
9
10        for (int i = 1; i < temp.length(); i++) {
11
12            int j = lps[i - 1];
13
14            while (j > 0 && temp.charAt(i) != temp.charAt(j)) {
15                j = lps[j - 1];
16            }
17
18            if (temp.charAt(i) == temp.charAt(j)) {
19                j++;
20            }
21
22            lps[i] = j;
23        }
24
25        int palindromeLength = lps[temp.length() - 1];
26
27        String suffix = s.substring(palindromeLength);
28
29        return new StringBuilder(suffix).reverse().toString() + s;
30    }
31}