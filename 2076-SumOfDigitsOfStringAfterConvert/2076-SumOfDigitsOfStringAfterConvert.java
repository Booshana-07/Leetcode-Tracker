// Last updated: 7/9/2026, 3:08:01 PM
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append((int) s.charAt(i)-96);
        }int sum=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<sb.length();j++){
                sum+=Integer.parseInt(sb.charAt(j)+"");
            }
           sb= new StringBuilder(sum+"");
           sum=0;
        }
        return Integer.parseInt(sb+"");
    }
}