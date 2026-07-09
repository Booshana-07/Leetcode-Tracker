// Last updated: 7/9/2026, 3:12:34 PM
class Solution {
    public boolean isPalindrome(int x){
        int original = x;
        int rev = 0;
        while(x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x/10;
        }
        return original == rev;
    }
}