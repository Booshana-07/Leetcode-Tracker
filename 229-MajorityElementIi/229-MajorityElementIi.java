// Last updated: 7/9/2026, 3:09:52 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l = new ArrayList<>(); 
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>n/3){
                if(!l.contains(nums[i])){
                    l.add(nums[i]);
                }
            }
        }
        return l;
    }
}