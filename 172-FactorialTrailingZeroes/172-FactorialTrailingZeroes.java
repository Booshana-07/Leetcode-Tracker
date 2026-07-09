// Last updated: 7/9/2026, 3:10:28 PM
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
    while (n > 0) {
        n /= 5;
        res += n;
    }
    return res;
    }
}