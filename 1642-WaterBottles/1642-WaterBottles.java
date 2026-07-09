// Last updated: 7/9/2026, 3:08:11 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans += newBottles ;
            numBottles = newBottles + remBottles;
        }
        return ans ;
    }
}