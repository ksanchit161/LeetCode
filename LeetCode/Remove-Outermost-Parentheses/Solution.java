1class Solution {
2    public String removeOuterParentheses(String s) {
3        var ans=new StringBuilder("");
4        int open=0;
5        for(char ch : s.toCharArray()){
6            if(ch=='(' && open>=1) {
7                ans.append('(');
8                open++;
9            }
10            else if(ch=='(') open++;
11            else if(ch==')' && open>1) {
12                ans.append(ch);
13                open--;
14            }
15            else if(ch==')' && open==1) open--;
16        }
17        return ans.toString();
18    }
19}