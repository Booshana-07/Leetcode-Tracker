// Last updated: 7/9/2026, 3:09:46 PM
class Solution {
    public int addDigits(int num) {
        while(num>=10){ 
        int sum=0;
            while(num!=0){
            sum+=num%10;
            num = num/10;
            }
            num=sum;
        }
        return num;
    }
}