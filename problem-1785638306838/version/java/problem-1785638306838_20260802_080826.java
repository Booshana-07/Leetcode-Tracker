// Last updated: 8/2/2026, 8:08:26 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long max = 0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                long g = gcd(nums[i], nums[j]);
7                long strength = (1L * nums[i]*nums[j])/(g*g);
8                if(strength > max){
9                    max = strength;
10                }
11            }
12        }
13        return max;
14    }
15    private long gcd(long a, long b){
16        while(b != 0){
17            long temp = b;
18            b = a % b;
19            a = temp;
20        }
21        return a;
22    }
23}