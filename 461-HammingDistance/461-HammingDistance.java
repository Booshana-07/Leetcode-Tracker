// Last updated: 7/9/2026, 3:09:16 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
    int m = x^y;                  
    while(m != 0){                
        if((m&1) == 1)
            count++;
        m = m>>1;
    }
    return count;
    }
}