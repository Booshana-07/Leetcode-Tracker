// Last updated: 8/1/2026, 8:11:13 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int zero = 0, one = 0;
4        int ans = 0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i) == '0')
7                zero++;
8            else
9                one++;
10            if(Math.abs(zero-one) <= 1)
11                ans++;
12        }
13        return ans;
14    }
15}