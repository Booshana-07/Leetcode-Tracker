// Last updated: 7/9/2026, 3:10:47 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int remGas = 0;
        int ans = 0;
        for(int i = 0; i < gas.length; i++){
            totalCost += gas[i] - cost[i];
            remGas += gas[i] - cost[i];
            if(remGas < 0){
                remGas = 0;
                ans = i+1;
            }
        }
        return totalCost >= 0 ? ans : -1;
    }
}