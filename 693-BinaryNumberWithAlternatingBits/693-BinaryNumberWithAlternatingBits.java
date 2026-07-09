// Last updated: 7/9/2026, 3:08:53 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n>>1;
        while(n!=0){
            if((n&1)==(x&1)){
                break;
            }
            n>>=1;
            x>>=1;
        }
        return n==0?true:false;
    }
}