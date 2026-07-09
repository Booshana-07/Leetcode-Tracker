// Last updated: 7/9/2026, 3:08:24 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        for(int pos:position){
            if(pos%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}