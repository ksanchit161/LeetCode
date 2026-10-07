1class Solution {
2    public int minAddToMakeValid(String s) {
3        int open=0;
4        int ans=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='(') open++;
7            else if(ch==')' && open>0) open--;
8            else if(ch==')') ans++;
9        }
10        return Math.abs(open)+ans;
11    }
12}