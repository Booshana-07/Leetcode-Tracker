// Last updated: 7/18/2026, 8:47:34 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder before = new StringBuilder();
4        StringBuilder middle = new StringBuilder();
5        StringBuilder after = new StringBuilder();
6        for(char ch : s.toCharArray()){
7            if(ch == y){
8                before.append(ch);
9            }else if(ch == x){
10                after.append(ch);
11            }else{
12                middle.append(ch);
13            }
14        }
15        return before.toString() + middle.toString() + after.toString();
16    }
17}