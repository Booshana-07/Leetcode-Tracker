// Last updated: 7/9/2026, 3:08:12 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
    HashMap<Integer,Integer>freq = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int n : freq.values()){
            pairs += (n*(n-1))/2;
        }
        return pairs;
    }
}