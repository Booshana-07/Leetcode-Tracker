// Last updated: 7/9/2026, 3:07:39 PM
class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int Sum = 0;
        for(int i = 0;i < s.length(); i++){
            int d = s.charAt(i) - '0';
            if(i%2 == 0)
                Sum+=d;
            else
                Sum-=d;
        }
        return Sum;
    }
}