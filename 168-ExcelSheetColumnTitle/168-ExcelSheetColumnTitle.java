// Last updated: 7/9/2026, 3:10:32 PM
class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n != 0){
            int d = --n % 26;
            sb.append((char)(d + 65));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}