// Last updated: 7/9/2026, 3:11:20 PM
class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int a = 1;
        int b = x;
        int c = 0;
        while(a <= b){
            long mid = a + (b - a) / 2;
            if(mid * mid <= x){
                c = (int) mid;
                a = (int) mid + 1;
            }else{
                b = (int) mid - 1;
            }
        }
        return c;
    }
}