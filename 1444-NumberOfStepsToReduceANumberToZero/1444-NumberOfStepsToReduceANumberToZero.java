// Last updated: 7/9/2026, 3:08:16 PM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0){
            if(num%2 == 0){
               num = num/2;
            }else{
                num = num - 1;
            }
            count++;
        }
        return count;
    }
}