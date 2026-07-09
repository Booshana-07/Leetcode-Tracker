// Last updated: 7/9/2026, 3:07:02 PM
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                int x = list.get(i);
                int y = list.get(j);
                if(!map.get(x).equals(map.get(y))){
                    return new int[]{x,y};
                }
            }
        }
        return new int[]{-1, -1};
    }
}