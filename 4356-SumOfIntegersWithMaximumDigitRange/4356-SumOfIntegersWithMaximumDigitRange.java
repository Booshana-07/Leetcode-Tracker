// Last updated: 7/9/2026, 3:07:05 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;
        for(int num: nums){
            int temp = num;
            int max = 0;
            int min = 9;
            while(temp > 0){
                int digit = temp%10;
                if(digit>max)max = digit;
                if(digit<min)min = digit;
                temp /= 10;
            }
            int range = max - min;
            if(range > maxRange){
                maxRange = range;
                sum = num;
            }else if(range == maxRange){
                sum += num;
            }
        }
        return sum;
    }
}